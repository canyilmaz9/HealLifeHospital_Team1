package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.ReusableMethods;
import utils.ExcelReader;

public class LoginSteps {
	private static final Logger logger = LogManager.getLogger(LoginSteps.class);
	WebDriver driver = stepdefinitions.Hooks.getDriver();
	LoginPage loginPage = new LoginPage(driver);

	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
		driver.get(config.ConfigReader.getProperty("url"));
	}

	@When("the user enters valid credentials")
	public void theUserEntersValidCredentials() {
		loginPage.login("testUser", "password123");
	}

	@Then("the user should see the home page")
	public void theUserShouldSeeTheHomePage() {
		// Assertion logic


	}

	@Given("kullanici anasayfada")
	public void kullaniciAnasayfada() {
		driver.get(ConfigReader.getProperty("homePageUrl"));
		String homePageUrl = ConfigReader.getProperty("homePageUrl");
		logger.info("Heal Life Hospital ana sayfasına gidildi: " + homePageUrl );
		Assert.assertEquals(ConfigReader.getProperty("homePageUrl"),driver.getCurrentUrl());
		logger.info("Heal Life Hospital ana sayfasında oldugu dogrulandi" );
	}

	@When("login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir")
	public void loginButonuGorunurVeTiklanabilirOlduguDogrulanirVeTiklanirTiklandiktanSonraUserloginSayfasindaOlduguDogrulanir() {
		Assert.assertTrue(loginPage.homePageLoginButton.isDisplayed());
		logger.info("Ana sayfada login butonu goruntulendi" );
		Assert.assertTrue(loginPage.homePageLoginButton.isEnabled());
		logger.info("Ana sayfada login butonu tiklanabilirligi dogrulandi" );
		loginPage.homePageLoginButton.click();
		logger.info("Ana sayfada login butonu tiklandi" );
		String loginPageUrl = ConfigReader.getProperty("loginPageUrl");
		Assert.assertEquals(ConfigReader.getProperty("loginPageUrl"),loginPageUrl);
		logger.info("Login page sayfasına gidildigi dogrulandi: " + loginPageUrl );
	}

	@And("user login sayfasinda sagda login penceresi solda latest new bilgileri bulunur")
	public void userLoginSayfasindaSagdaLoginPenceresiSoldaLatestNewBilgileriBulunur() {
		loginPage.loginPageBoxes();
		logger.info("user login sayfasinda sagda login penceresi solda latest new bilgileri bulundu" );
	}

	@Then("user login sayfasinda \\(sisteme daha önceden kayitli) bilgiler girilerek dashboard panele login olunur.")
	public void userLoginSayfasindaSistemeDahaÖncedenKayitliBilgilerGirilerekDashboardPaneleLoginOlunur() {
		loginPage.setLogin(ConfigReader.getProperty("patientUsername"),ConfigReader.getProperty("patientPassword"));

		String patientDashboardUrl=ConfigReader.getProperty("patientDashboardUrl");
		Assert.assertEquals(patientDashboardUrl,driver.getCurrentUrl());
		ReusableMethods.bekle(2);


	}

	@And("username kutusuna dogru email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.")
	public void usernameKutusunaDogruEmailPasswordKutusunaYanlisSifreGirilerekSignInButonunaTiklanir() {
		loginPage.setLogin(ConfigReader.getProperty("patientUsername"),"yanlisSifre");
	}

	@Then("Kullanicinin giris yapamadigi dogrulanir")
	public void kullanicininGirisYapamadigiDogrulanir() {
		loginPage.invalidLoginAlert.isDisplayed();
	}

	@And("username kutusuna yanlis email, password kutusuna dogru sifre girilerek sign in butonuna tiklanir.")
	public void usernameKutusunaYanlisEmailPasswordKutusunaDogruSifreGirilerekSignInButonunaTiklanir() {
		loginPage.setLogin("yanlisKullaniciadi",ConfigReader.getProperty("patientPassword"));
	}


	@And("username kutusuna yanlis email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.")
	public void usernameKutusunaYanlisEmailPasswordKutusunaYanlisSifreGirilerekSignInButonunaTiklanir() {
		loginPage.setLogin("yanlisKullaniciadi","yanlisSifre");

	}

	@Then("User Login sayfasinda forget password linki bulunmali ve bu linke tiklaninca ufpassword sayfasina yönlendirmeli.")
	public void userLoginSayfasindaForgetPasswordLinkiBulunmaliVeBuLinkeTiklanincaSayfasinaYönlendirmeli() {
		loginPage.forgotPasswordBox.isDisplayed();
		logger.info("user login sayfasinda Forgot Password butonu goruntulendi" );
		loginPage.forgotPasswordBox.click();
		logger.info("Forgot Password butonu tiklandi" );
		String exceptedUrl = "https://qa.heallifehospital.com/site/ufpassword";
		Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
		logger.info("ufpassword sayfasina yönlendirildigi dogrulandi" );
	}

	@And("Forgot password sayfasinda parola sifirlama islemi icin ilgili textBox'a mail adresi girilebilmeli")
	public void forgotPasswordSayfasindaParolaSifirlamaIslemiIcinIlgiliTextBoxAMailAdresiGirilebilmeli() {
		loginPage.forgotPasswordMailBox.isDisplayed();
		loginPage.forgotPasswordMailBox.sendKeys(ConfigReader.getProperty("patientEmail"));
		loginPage.submitButton.click();
	}

	@And("Forgot password sayfasindaki textBox'a girilen mail adresine sifre gönderilmeli.")
	public void forgotPasswordSayfasindakiTextBoxAGirilenMailAdresineSifreGönderilmeli() {
		logger.error("Isleme dair herhangi bir alert box vb. cikmiyor. Mail gondermiyor ve submit butonu tiklandiginda " +
				"login sayfasina donuyor.");
	}

	@Then("Forgot password sayfasinda login sayfasina dönmek icin user login linki bulunmali ve bu linke tiklaninca userlogin sayfasina yönlendirmeli.")
	public void forgotPasswordSayfasindaLoginSayfasinaDönmekIcinUserLoginLinkiBulunmaliVeBuLinkeTiklanincaSayfasinaYönlendirmeli() {
		loginPage.forgotPasswordBox.click();
		loginPage.ufpasswordPageUserLoginBtn.isDisplayed();
		loginPage.ufpasswordPageUserLoginBtn.click();
	}

	@And("Hasta girisini yapar")
	public void hastaGirisiniYapar() {
		loginPage.homePageLoginButton.click();
		loginPage.setLogin("pat121","3odixh");
	}

	@And("Dashboard navbar'indaki HealLifeHospital logosuna tiklar ve tekrar Dashboard's geldigini dogrular")
	public void dashboardNavbarIndakiHealLifeHospitalLogosunaTiklarVeTekrarDashboardSGeldiginiDogrular() {
		loginPage.dashboardLogo.click();
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://qa.heallifehospital.com/patient/dashboard";
		Assert.assertEquals(expectedUrl, currentUrl);

	}

	@Then("Dashboard navbar'indaki bayrak simgesine tiklar ve dili degistirir mandarin dilin degistigini dogrular")
	public void dashboardNavbarIndakiBayrakSimgesineTiklarVeDiliDegistirirMandarinDilinDegistiginiDogrular() {
		String usAmbulance = loginPage.ambulance.getText();
		loginPage.languageSwitcherButton.click();
		loginPage.trLanguage.click();
		String trAmbulans = loginPage.ambulans.getText();
		Assert.assertEquals(trAmbulans,usAmbulance);


	}

	@Then("login sayfasinda sagda login penceresi solda latest new bilgileri bulunur")
	public void loginSayfasindaSagdaLoginPenceresiSoldaLatestNewBilgileriBulunur() {
		loginPage.loginPageBoxes();
		logger.info("login sayfasinda sagda login penceresi solda latest new bilgileri bulundu" );
	}

	@Then("Login sayfasinda \\(sisteme daha önceden kayitli) bilgiler girilerek admin panele login olunur.")
	public void loginSayfasindaSistemeDahaÖncedenKayitliBilgilerGirilerekAdminPaneleLoginOlunur() {
		loginPage.adminSignin(ConfigReader.getProperty("testData"),0,7,3,
				0,7,2);
		String exceptedURL = "https://qa.heallifehospital.com/admin/admin/dashboard";
		Assert.assertEquals(exceptedURL,driver.getCurrentUrl());
		logger.info("Sisteme daha önceden kayitli bilgiler girilerek admin panele login olundu.");
	}


	@Then("Login sayfasinda \\(yanlis eksik veya sisteme daha önceden kayitli olmayan) bilgiler girilerek admin panele login olunmaz.")
	public void loginSayfasindaYanlisEksikVeyaSistemeDahaÖncedenKayitliOlmayanBilgilerGirilerekAdminPaneleLoginOlunmaz() {
		loginPage.adminSignin(ConfigReader.getProperty("testData"),1,1,1,
				0,7,2);

		String exceptedUyari = "Invalid Username or Password";
		Assert.assertEquals(exceptedUyari, loginPage.invalidLoginAlert.getText());
		logger.info("Yanlis kullanici adi ve dogru sifre ile sisteme giris yapilamadigi dogrulandi");


		loginPage.adminSignin(ConfigReader.getProperty("testData"),0,7,3,
				1,1,1);

		Assert.assertEquals(exceptedUyari,loginPage.invalidLoginAlert.getText());
		logger.info("Dogru kullanici adi ve yanlis sifre ile sisteme giris yapilamadigi dogrulandi");

		loginPage.adminSignin(ConfigReader.getProperty("testData"),1,1,1,
				0,7,3);

		Assert.assertEquals(exceptedUyari,loginPage.invalidLoginAlert.getText());
		logger.info("Yanlis kullanici adi ve yanlis sifre ile sisteme giris yapilamadigi dogrulandi");
	}


	@When("Login sayfasinda forget password linki bulunmali ve bu linke tiklaninca forgotpassword sayfasina yönlendirmeli.")
	public void loginSayfasindaForgetPasswordLinkiBulunmaliVeBuLinkeTiklanincaSayfasinaYönlendirmeli() {
		loginPage.forgotPasswordBox.isDisplayed();
		logger.info("login sayfasinda Forgot Password butonu goruntulendi" );
		loginPage.forgotPasswordBox.click();
		logger.info("Forgot Password butonu tiklandi." );
		String exceptedUrl = "https://qa.heallifehospital.com/site/forgotpassword";
		Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
		logger.info("Forget password sayfasina yönlendirildigi dogrulandi." );
	}

	@And("Forgot password sayfasindaki textBox'a girilen mail adresine sifre gönderir")
	public void forgotPasswordSayfasindakiTextBoxAGirilenMailAdresineSifreGönderir() {
		loginPage.forgotPasswordMailBox.isDisplayed();
		logger.info("Forgot password sayfasinda Email kutusu goruntulendi");
		loginPage.forgotPasswordMailBox.sendKeys("rastgele@mail.com");
		String alertText = "Your password has been sent to your e-mail address.";
		Assert.assertEquals(alertText,loginPage.mailSendAlert.getText());
		logger.info("Mail gonderildigi sayfada cikan alert uzerinden dogrulandi.");

		logger.debug("Sayfada kayitli bir admin email'i ile girildiginde herhangi bir alert cikmamakla birlikte, Submit butonu tiklandiginda" +
				" login sayfasina geri atiyor!");
	}

	@Then("Forgot password sayfasinda login sayfasina dönmek icin admin login linki bulunmali ve bu linke tiklaninca login sayfasina yönlendirmeli.")
	public void forgotPasswordSayfasindaLoginSayfasinaDönmekIcinAdminLoginLinkiBulunmaliVeBuLinkeTiklanincaLoginSayfasinaYönlendirmeli() {
		loginPage.loginfpAdminLoginBtn.isDisplayed();
		logger.info("login sayfasina dönmek icin admin login linki goruntulendi");
		loginPage.loginfpAdminLoginBtn.click();
		String exceptedURL = "https://qa.heallifehospital.com/site/login";
		Assert.assertEquals(exceptedURL,driver.getCurrentUrl());
		logger.info("admin login linki tiklandiginda Admin Login sayfasina yonlendirildigi URL uzerinden dogrulandi.");
	}
}
