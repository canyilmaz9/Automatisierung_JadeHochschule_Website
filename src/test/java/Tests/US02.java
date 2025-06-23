package Tests;

import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

import static utilities.Driver.driver;

public class US02 extends TestBaseRapor {

    @Test
    void Testfall(){

        //MainPage Class hat ein Objekt als driver
        MainPage mainPage = new MainPage(driver);

        //Test Bericht wird erstellt mit extentReports Methode
        extentTest = extentReports.createTest("ErrorFindingTest", "Checking Errors in the Webpage");

        driver.get("https://www.jade-hs.de");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Xpath wird benutz, um das Element in HTML-Seite zu finden
        WebElement cookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ccm-widget']/div/div[2]/div[3]/button[1]")));
        ReusableMethods.bekle(2);
        //Ablehnen Button wird geklickt
        cookiesButton.click();

        ReusableMethods.bekle(5);
        //Suchfeld wird geclickt
        mainPage.Jade_Input.click();

        extentTest.info("Suche Feld ist geclickt");

        ReusableMethods.bekle(2);
        //Ingenieurinformatik wird geschriben
        mainPage.Jade_Input.sendKeys("Ingenieurinformatik");

        extentTest.info("Gesuchte Element wurde geschrieben");

        ReusableMethods.bekle(3);
        mainPage.Jade_Submit.click();

        extentTest.info("Gesucht ist erfoglreich");

        ReusableMethods.bekle(3);

        mainPage.Jade_Ingenieurinformatik.sendKeys(Keys.PAGE_DOWN);

        ReusableMethods.bekle(3);

        mainPage.Jade_Ingenieurinformatik.click();

        ReusableMethods.bekle(2);

        //Die Log-Einträge des Browsers zu erhalten
        LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logs) {
            //entry wird verwendet, um jeden-Log-Eintraf zu referenzieren
            System.out.println(entry.getLevel() + " " + entry.getMessage());
            extentTest.info(entry.getLevel() + " " + entry.getMessage());
        }

        //Test Bericht Datei zu schreiben
        extentTest.info("Logs are written in console");

    }
}
