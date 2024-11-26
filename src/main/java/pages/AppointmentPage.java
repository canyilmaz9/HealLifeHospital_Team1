package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage extends BasePage{
    public AppointmentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[2]/a")
    public WebElement AppointmentButton;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement SpecialistButton;

    @FindBy(xpath = "(//li[@class='select2-results__option'])[1]")
    public WebElement CardiologistButton;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
    public WebElement DoctorButton;

    @FindBy(xpath = "(//li[@class='select2-results__option'])[1]")
    public WebElement SoniaButton;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
    public WebElement ShifttButton;

    @FindBy(xpath = "/html/body/span/span/span[2]/ul/li[3]")
    public WebElement EveningButton;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement DateButton;

    @FindBy (xpath = "//textarea[@name='message']")
    public WebElement Message;

    @FindBy (xpath = "//*[@id=\"shift\"]/div/div/strong")
    public WebElement slot;

    @FindBy (xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[3]/span[5]")
    public WebElement timeSelection;

    @FindBy (xpath = "//input[@name='patient_name']")
    public WebElement patientName;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//a[@class='btn btn-info btn-xs']")
    public WebElement payButton;

    @FindBy(xpath = "//button/span[@style='display: block; min-height: 30px;']")
    public WebElement payWithCardButton;

    @FindBy (xpath = "(//div/input)[1]")
    public WebElement payEmail;

    @FindBy (xpath = "(//div/input)[2]")
    public WebElement payCardNumber;

    @FindBy (xpath = "(//div/input)[3]")
    public WebElement payExpire;

    @FindBy (xpath = "(//div/input)[4]")
    public WebElement payCVV;

    @FindBy (xpath = "(//div/input)[5]")
    public WebElement payZIPcode;

    @FindBy(xpath = "//*[@id=\"submitButton\"]/span/span")
    public WebElement payment;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement adminLogin;

    @FindBy(xpath = " //*[@id=\"password\"]")
    public WebElement passwordLogin;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInLogin;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[19]/a")
    public WebElement SetupButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[15]/a")
    public WebElement FinanceButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[15]/ul/li[1]/a")
    public WebElement Income;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
    public WebElement SearchBoxIncome;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm addincome']")
    public WebElement AddIncome;

    @FindBy(xpath = "//select[@name='inc_head_id']")
    public WebElement IncomeHead;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement IncomeName;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement IncomeAmount;

    @FindBy(xpath = "//button[@id='add_incomebtn']")
    public WebElement IncomeSave;

    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[15]/ul/li[2]/a")
    public WebElement Expence;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm addexpense']")
    public WebElement AddExpence;

    @FindBy(xpath = "//select[@name='exp_head_id']")
    public WebElement ExpenceHead;

    @FindBy(xpath = "//*[@id=\"exp_head_id\"]/option[2]")
    public WebElement ExpenceSelect;

    @FindBy(xpath = "//button[@id='addexpensebtn']")
    public WebElement ExpenceSave;




















}
