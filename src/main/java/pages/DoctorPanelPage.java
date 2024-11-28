package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorPanelPage extends BasePage {

    public DoctorPanelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='loginbg']")
    public WebElement adminLoginFormBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement userNameBox;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@class='mCSB_container']")
    public WebElement newsBox;

    @FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[6]/a/img")
    public WebElement dropDownDoctorMenu;

    @FindBy(xpath = ("(//*[@class=\"pull-right\"])[2]"))
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement invalidDataAlert;

    @FindBy(xpath = "//*[@id='form-username']")
    public WebElement forgotPasswordEmailBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement forgotPasswordSubmitBox;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement sentEmailAlert;

    @FindBy(xpath = "//*[@class='forgot']")
    public WebElement returnToAdminLoginPage;


}


















