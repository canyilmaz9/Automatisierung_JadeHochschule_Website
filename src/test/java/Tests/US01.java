package Tests;

import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ReusableMethods;

import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;
import java.util.logging.Level;

import static utilities.Driver.driver;

public class US01 extends TestBaseRapor{

    @Test
    void Testfall() {
        //Test Bericht wird erstellt mit extentReports Methode
        extentTest = extentReports.createTest("ErrorFindingTest", "Checking Errors in the Webpage");

        //Configuration für den Chrome-Browser in order to use different settings from Headless-Modus

        // Headless Browser is a web browser that does not need graphical user interface (GUI)
        // It is suitable for automated testing without needing a display.

        //Usage about Browser-Extension orr Logging-Settings Configuration

        ChromeOptions options = new ChromeOptions();

        //A new object is created. With logPrefs it can be generated which types of log entries
        LoggingPreferences logPrefs = new LoggingPreferences();

        //enable methods gives us a chance to activate Browser
        //LogType.BROWSER determines logging settings to be cofigurated

        //Level.ALL bestimmt alle Log-Einträge, die generiert werden sollen
        logPrefs.enable(LogType.BROWSER, Level.ALL);

        //Logging-Einstellung für den Chrome-Browser konfiguriert
        //setCapability() wird verwendet, bestimme Einstellung zu konfigurieren
        //goog:loggingPrfes ist der Name der Einstellung
        //logPrefs ist das Objekt, das die Logging-Einstellung enthält

        options.setCapability("goog:loggingPrefs", logPrefs);

        // Probleme oder Fehler zu finden

        // Erstellung von softAssert, um actual und expected Variablen zu vergleichen
        SoftAssert softAssert = new SoftAssert();

        //MainPage Class hat ein Objekt als driver
        MainPage mainPage = new MainPage(driver);

        driver.get("https://www.jade-hs.de");
        ReusableMethods.bekle(3);

        //Die Klasse wird verwendet, um 10 Sekunden zu warten,
        // bis eine bestimmte Bedingung erfüllt ist.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Xpath wird benutz, um das Element in HTML-Seite zu finden
        WebElement cookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ccm-widget']/div/div[2]/div[3]/button[1]")));

        //Ablehnen Button wird geklickt
        cookiesButton.click();

        ReusableMethods.bekle(2);

        // Validierung Aktueller Title
        String expectedCurrentTitle = "Jade Hochschule";
        String actualCurrentTitle = driver.getTitle();

        //Test Bericht Datei zu schreiben
        extentTest.info("Aktueller Titel wird geprüft(checked)");

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        // Cliken auf Logo
        ReusableMethods.bekle(2);
        mainPage.Jade_Hochschule_Logo.click();

        ReusableMethods.bekle(2);

        String expectedHeader = "Besser Studieren";
        String actualHeader = mainPage.Jade_Besser_Studieren.getText();

        //Test Bericht Datei zu schreiben
        extentTest.info("Der Slogan der Jadehochschule wird geprüft(checked)");

        softAssert.assertEquals(actualHeader, expectedHeader);

        //Log-Einträge
        LogEntries logs;

        //Die Log-Einträge des Browsers zu erhalten
        logs = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logs) {
            //entry wird verwendet, um jeden-Log-Eintraf zu referenzieren
            System.out.println(entry.getLevel() + " " + entry.getMessage());
            extentTest.info(entry.getLevel() + " " + entry.getMessage());
        }

        //Test Bericht Datei zu schreiben
        extentTest.info("Logs are written in console");

        //Die Kündigung von driver
        driver.quit();
    }


    public static void main(String[] args) {


    }

}
