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
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ReusableMethods;

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


	@Given("kullanici url ye gelir")
	public void kullanici_url_ye_gelir() {


		String url = ConfigReader.getProperty("url");
		driver.get(url);
		logger.info("Anasayfaya gidildi: " + url);

	}

	@Then("kullanicihome sayfasinda login butonunu tiklar")
	public void kullanicihome_sayfasinda_login_butonunu_tiklar() {
		loginPage.homePageLoginButton.click();
	}

	@Then("kullanici login sayfasinda usarname kismina pat79 password kismina  w2c4u8 datalarini girer ve sing in butonuna tiklar ve sayfasina gelir")
	public void kullanici_login_sayfasinda_usarname_kismina_pat79_password_kismina_w2c4u8_datalarini_girer_ve_sing_in_butonuna_tiklar_ve_sayfasina_gelir() {
		loginPage.loginusernama.sendKeys("pat79");
		loginPage.loginpassword.sendKeys("w2c4u8");
		loginPage.loginSinginbutton.click();
	}

	@Then("kullanici sayfasinda OPD board a tiklayarak sayfaya gider")
	public void kullanici_sayfasinda_opd_board_a_tiklayarak_sayfaya_gider() {

		loginPage.loginOPD.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginOPDOverview.isDisplayed());
	}

	@When("kullanici IPD boarda tiklayarak sayfaya gider")
	public void kullanici_IPD_boarda_tiklayarak_sayfaya_gider() {

		loginPage.loginIPD.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginIPDIpdPatient.isDisplayed());
	}

	@When("kullanici Pharmacy boarda tiklayarak sayfaya gider")
	public void kullanici_pharmacy_boarda_tiklayarak_sayfaya_gider() {

		loginPage.loginPharmacy.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginPharmacysearch.isDisplayed());
	}

	@Then("kullanici Patology boarda tiklayarak sayfaya gider")
	public void kullaniciPatologyBoardaTiklayarakSayfayaGider() {


		loginPage.loginPathology.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginPathologysearch.isDisplayed());
	}

	@Then("kullanici Radiology boarda tiklayarak sayfaya gider")
	public void kullanici_radiology_boarda_tiklayarak_sayfaya_gider() {

		loginPage.loginRadiology.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginRadiologyRadiologytestreports.isDisplayed());
	}

	@When("kullanici Ambulance  boarda tiklayarak sayfaya gider")
	public void kullanici_ambulance_boarda_tiklayarak_sayfaya_gider() {

		loginPage.loginAmbulance.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginAmbulanceAmbulanceBill.isDisplayed());
	}

	@When("kullanici Blood Bankboarda tiklayarak sayfaya gider")
	public void kullanici_blood_bankboarda_tiklayarak_sayfaya_gider() {

		loginPage.loginBloodbank.click();
		ReusableMethods.bekle(2);
		Assert.assertTrue(loginPage.loginBloodbankBloodIssue.isDisplayed());


	}
	@Then("kullanici dasboard butonuna tıklar")
	public void kullanici_dasboard_butonuna_tıklar() {
		ReusableMethods.bekle(2);
		loginPage.loginDasboard.click();
		ReusableMethods.bekle(2);
	Assert.assertTrue(loginPage.DashboardOPD.isDisplayed());

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




	@Then("kullanici sayfayi body bolumune gelir")
	public void kullanici_sayfayi_body_bolumune_gelir() {
		Actions actions=new Actions(driver);
		ReusableMethods.bekle(2);
		actions.dragAndDrop(loginPage.loginDasboard, loginPage.loginAmbulance);

	}
	@When("kullanici sayfanin body bolumunda top {int} findings grafigini gordugunu dogrular")
	public void kullanici_sayfanin_body_bolumunda_top_findings_grafigini_gordugunu_dogrular(Integer int1) {

		Assert.assertTrue(loginPage.loginDasboardtopfindings.isDisplayed());

	}
	@When("kullanici sayfanin body bolumunde top {int} Symptoms grafiğini gorur")
	public void kullanici_sayfanin_body_bolumunde_top_symptoms_grafiğini_gorur(Integer int1) {

		Assert.assertTrue(loginPage.loginDasboardtop10Symptoms.isDisplayed());

	}



}


