package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelReader;

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

