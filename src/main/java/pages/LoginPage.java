package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath = "//*[@class=\"dropdown-toggle\"]")
	public WebElement profil;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li/ul/li/div/div[1]/a/img")
	public WebElement profilResim;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li/ul/li/div/div[2]/h5")
	public WebElement profilTitle;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li/ul/li/div/div[2]/h4")
	public WebElement profilIsim;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li/ul/li/div/div[4]/a[1]")
	public WebElement changePasswordButton;

	@FindBy(xpath = "//*[@id=\"passwordform\"]/div[1]/div/input")
	public WebElement currentPassword;

	@FindBy(xpath = "//*[@id=\"passwordform\"]/div[2]/div/input")
	public WebElement newPassword;

	@FindBy(xpath = "//*[@id=\"confirm_pass\"]")
	public WebElement confirmPassword;

	@FindBy(xpath = "//*[@type='submit']")
	public WebElement changePassword;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li/ul/li/div/div[4]/a[2]")
	public WebElement logoutButton;

	@FindBy(xpath = "//*[@id=\"toast-container\"]/div")
	public WebElement passwordChangedAlert;

	@FindBy(xpath = "//*[@id=\"toast-container\"]/div/button")
	public WebElement passwordChangedAlertX;

	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[1]/span")
	public WebElement hastaSayfaTitle;

	@FindBy(xpath = "//*[@class='sidebar-toggle']")
	public WebElement menuIsareti;

	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul/li[2]/a/span")
	public WebElement myAppoTitle;

}

