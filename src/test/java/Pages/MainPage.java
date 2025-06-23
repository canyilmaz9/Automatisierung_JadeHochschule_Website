package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Main;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(utilities.Driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[@class='c-logo']")
    public WebElement Jade_Hochschule_Logo;

    @FindBy (xpath = "//header//h1")
    public WebElement Jade_Besser_Studieren;

    @FindBy (xpath = "//button[@class='button ccm--decline-cookies ccm--ctrl-init']")
    public WebElement Jade_Cookies;

    @FindBy (xpath = "//input[@class='o-header__search-input']")
    public WebElement Jade_Input;

    @FindBy (xpath = "//button[@class='c-button is-icon-only is-rounded']")
    public WebElement Jade_Submit;

    @FindBy (xpath = "//*[@id=\"tx-solr-search\"]/div[4]/div/div[2]/div[1]/div[1]/div/h3/a")
    public WebElement Jade_Ingenieurinformatik;

    @FindBy (xpath = "//a[@title='Studienmöglichkeiten, Betreuung während des Studiums und die Wege nach dem Studium']")
    public WebElement Jade_Studium;

    @FindBy (xpath = "//a[@title='Vorlesungspläne']")
    public WebElement Jade_Vorlesungsplaene;

    @FindBy (xpath = "//a[@title='Forschung und Transfer, Forschungsprofil, Forschungsförderung']")
    public WebElement Jade_Forschung;

    @FindBy (xpath = "//a[@title='Niedersachsen-Technikum']")
    public WebElement Jade_Niedersachsen_Technikum;
}

