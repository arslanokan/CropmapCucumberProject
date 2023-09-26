package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.driver;

public class CropmapLoginPage {

    public CropmapLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = ".status-primary")
    public WebElement buttonStartDemo;

    @FindBy(css = ".sign-in")
    public WebElement buttonSignin;


    @FindBy(css = "[placeholder='Email']")
    public WebElement clickEmail;

    @FindBy(css = "[placeholder='Your password']")
    public WebElement clickPassword;

    @FindBy(css = ".button-style")
    public WebElement btnSignin;

    @FindBy(xpath = "//span[.='Plantation']")
    public WebElement checkPlantationText;

    @FindBy(xpath = "//span[.='Report']")
    public WebElement checkReportText;

    @FindBy(xpath = "//span[.='Profile']")
    public WebElement checkProfileText;

    @FindBy(xpath = "//span[.='Logout']")
    public WebElement checkLogoutText;

    @FindBy(xpath = "//div[@id='filterwrapper']//div[@class='row']/div[1]//div[@class='arrow']")
    public WebElement clickLocations;

    @FindBy(xpath = "//div[@class='filter-list']//span[@class='text']/span[.='All Turkey']")
    public WebElement unselectAllTurkey;

    @FindBy(xpath = "//div[@class='filter-list']//span[@class='text']/span[.='Adana']")
    public WebElement firstCitySelect;

    @FindBy(xpath = "//div[@class='filter-list']//span[@class='text']/span[.='Ankara']")
    public WebElement secondCitySelect;

    @FindBy(xpath = "//div[@class='filter-list']//span[@class='text']/span[.='Antalya']")
    public WebElement thirdCitySelect;

    @FindBy(xpath = "//div[@class='filter-list']//span[@class='text']/span[.='Antalya']")
    public WebElement fourthCitySelect;




}
