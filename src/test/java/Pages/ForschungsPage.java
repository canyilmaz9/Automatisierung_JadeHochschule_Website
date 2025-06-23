package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForschungsPage {

    public ForschungsPage(WebDriver driver){
        PageFactory.initElements(utilities.Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href='javascript:linkTo_UnCryptMailto(%27ocknvq%2Ckpc0dgemgtBlcfg%5C%2Fju0fg%27);']")
    public WebElement Jade_E_Mail_Button;
}
