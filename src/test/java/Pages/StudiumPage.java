package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudiumPage {

    public StudiumPage(WebDriver driver){
        PageFactory.initElements(utilities.Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@href='/veranstaltungsplaene/ingenieurwissenschaften/']")
    public WebElement Jade_Ingenieurwissenschaften;

    @FindBy (xpath = "//select[@name='Bezeichnung']")
    public WebElement Jade_Semesterplan;

    @FindBy (xpath = "//option[@value='InI MA 1']")
    public WebElement Jade_Ingenieurinformatik_MA_1;

    @FindBy (xpath = "//*[@id=\"Semesterplan\"]/input[1]")
    public WebElement Jade_Plananzeigen;

    @FindBy (xpath = "/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/span[2]")
    public WebElement Jade_Datum;

    @FindBy (xpath = "/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr/td[1]/span[4]")
    public WebElement Jade_Uhrzeit;



}
