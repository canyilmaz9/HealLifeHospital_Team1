package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelReader;

import java.util.Queue;

public class LoginPage extends BasePage {
	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='email']")
	public WebElement doktorLogInButton;

	public void login(String username, String password) {
		type(usernameInput, username);
		type(passwordInput, password);
		click(loginButton);
	}

	@FindBy(xpath = "//*[text()='Login']")
	public WebElement homePageLoginButton;

	@FindBy(xpath = "//*[@class=\"loginbg\"]")
	private WebElement loginBox;

	@FindBy(xpath = "//*[@class=\"col-lg-6 col-sm-6 col-sm-6\"]")
	private WebElement latestNewBox;

	public void loginPageBoxes(){
		Assert.assertTrue(loginBox.isDisplayed());
		Assert.assertTrue(latestNewBox.isDisplayed());

	}

	@FindBy(id = "email")
	private WebElement usernameBox;

	@FindBy(id = "password")
	private WebElement passwordBox;

	@FindBy(className = "btn")
	private WebElement signInButton;

	public void setLogin(String username, String password) {
		Assert.assertTrue(usernameBox.isDisplayed());
		Assert.assertTrue(passwordBox.isDisplayed());
		type(usernameBox, username);
		type(passwordBox, password);
		click(signInButton);
	}

	@FindBy(xpath = "//*[@class=\"alert alert-danger\"]")
	public WebElement invalidLoginAlert;

	@FindBy(xpath = "//*[@class=\"forgot\"]")
	public WebElement forgotPasswordBox;

	@FindBy(xpath = "//*[@type=\"text\"]")
	public WebElement forgotPasswordMailBox;

	@FindBy(className = "btn")
	public WebElement submitButton;

	@FindBy(className = "forgot")
	public WebElement ufpasswordPageUserLoginBtn;

	@FindBy (xpath = "//input[@id='email']")
	public WebElement loginusernama;

	@FindBy(xpath ="//input[@id='password']" )
	public WebElement loginpassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginSinginbutton;

	@FindBy(xpath = "//span[normalize-space()='OPD']")
	public WebElement loginOPD;

	@FindBy(xpath = "//a[normalize-space()='Overview']")
	public WebElement loginOPDOverview;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[4]/a/i")
	public WebElement loginIPD;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement loginIPDIpdPatient;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[5]/a/span")
	public WebElement loginPharmacy;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement loginPharmacysearch;

	@FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/patient/dashboard/pathology']")
	public WebElement loginPathology;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement loginPathologysearch;

	@FindBy(xpath = "//span[normalize-space()='Radiology']")
	public WebElement loginRadiology;

	@FindBy(xpath = "//h3[@class='box-title titlefix']")
	public WebElement loginRadiologyRadiologytestreports;

	@FindBy(xpath ="//span[normalize-space()='Ambulance']" )
	public WebElement loginAmbulance;

	@FindBy(xpath = "//h3[@class='box-title titlefix']")
	public WebElement loginAmbulanceAmbulanceBill;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[9]/a/span")
	public WebElement loginBloodbank;

	@FindBy(xpath ="//h3[normalize-space()='Blood Issue']" )
	public WebElement loginBloodbankBloodIssue;

	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	public WebElement loginDasboard;

	@FindBy(xpath = "//canvas[@id='medical-history-chart']")
	public WebElement DashboardOPD;

	@FindBy(xpath = "//canvas[@id='finding-bar-chart']")
	public WebElement loginDasboardtopfindings;

    @FindBy(xpath ="//canvas[@id='symptom-bar-chart']")
    public WebElement loginDasboardtop10Symptoms;

	@FindBy(xpath = "//*[@id=\"alert\"]/a/span[2]/img")
	public WebElement dashboardLogo;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/div/div/button")
	public WebElement languageSwitcherButton;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/div/div/div/ul")
	public WebElement languageDropdownMenu;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[8]/a/span")
	public WebElement ambulance;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[8]/a/span")
	public WebElement ambulans;

	@FindBy(xpath = "//*[@rel=\"1\"]")
	public WebElement trLanguage;


}

