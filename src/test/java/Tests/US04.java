package Tests;

import Pages.ForschungsPage;
import Pages.MainPage;
import Pages.StudiumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

import static utilities.Driver.driver;

public class US04 extends TestBaseRapor {

    @Test
    void Testfall(){
        // Objekte werden definiert, um zu benutzen
        MainPage mainPage = new MainPage(driver);

        StudiumPage studiumPage = new StudiumPage(driver);

        ForschungsPage forschungsPage = new ForschungsPage(driver);

        SoftAssert softAssert = new SoftAssert();

        extentTest = extentReports.createTest("ErrorFindingTest", "Checking Errors in the Webpage");

        driver.get("https://www.jade-hs.de");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Xpath wird benutz, um das Element in HTML-Seite zu finden
        WebElement cookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ccm-widget']/div/div[2]/div[3]/button[1]")));
        ReusableMethods.bekle(2);
        //Ablehnen Button wird geklickt
        cookiesButton.click();

        // Create Actions instance
        Actions actions = new Actions(driver);

        ReusableMethods.bekle(3);
        // Perform the hover
        actions.moveToElement(mainPage.Jade_Forschung).perform();

        ReusableMethods.bekle(5);

        mainPage.Jade_Niedersachsen_Technikum.click();

        extentTest.info("Niedersachsen Technikum ist geclickt");

        ReusableMethods.bekle(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        forschungsPage.Jade_E_Mail_Button.click();

        extentTest.info("Email Button ist geclickt");

        ReusableMethods.bekle(3);

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
