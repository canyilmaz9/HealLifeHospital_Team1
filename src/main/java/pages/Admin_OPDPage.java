package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_OPDPage extends BasePage{
    public Admin_OPDPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);


    }
    @FindBy(xpath = "//input[@id='email']")
    public WebElement adminloginusername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminloginpassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminloginsingin;



    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement adminOPDname;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement adminOPDpatient;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    public WebElement adminOPDguardianname;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    public WebElement adminOPDgender;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[5]")
    public WebElement adminOPDphone;

    @FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]" )
    public WebElement adminOPDconsultant;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[7]")
    public WebElement adminOPDlastvisit;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[8]")
    public WebElement adminOPDtotalrecheckup;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")
    public WebElement adminOPD;

    @FindBy(xpath = "//a[normalize-space()='Abaraham Lincoln']")
    public WebElement adminOPDnameAbraham;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement adminOPDnameteam1;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]")
    public WebElement adminOPDpatient137;

  @FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]" )
    public WebElement adminOPDpatient1;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]")
    public WebElement adminOPDguardiannamebosluk;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]")
    public WebElement adminOPDguardiannameyeohs;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[4]")
    public WebElement adminOPDgenderbosluk;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[4]")
    public WebElement adminOPDgendermale;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[5]")
    public WebElement adminOPDPhonebosluk;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[5]")
    public WebElement adminOPDphonenumara;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]")
    public WebElement adminconcultantamitsingh;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]")
    public WebElement adminconsultantsoniabush;

  @FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]" )
    public WebElement adminOPDlastvisittarih1;

  @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[7]")
    public WebElement adminOPDlastvisittarih2;

  @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement adminOPDSearch;

  @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
    public WebElement adminOPDlist;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_length\"]/label/select/option[1]")
    public WebElement adminOPDlist100;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_length\"]/label/select/option[2]")
    public WebElement adminOPDlistall;

    @FindBy (xpath = "//div[@class='box-tools addmeeting']//a[@id='add']")
    public WebElement adminOPDAddpatient;

    @FindBy(xpath = "//span[normalize-space()='New Patient']")
    public WebElement adminOPDNewpatient;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement adminOPDNewpatientName;

    @FindBy(xpath ="//input[@id='age_year']" )
    public WebElement adminOPDNewpatientyear;

    @FindBy(xpath = "//input[@id='age_month']")
    public WebElement adminOPDNewpatientmonth;

    @FindBy(xpath = "//input[@id='age_day']")
    public WebElement adminOPDNewpatientday;

    @FindBy(xpath = "//button[@id='formaddpabtn']//i[@class='fa fa-check-circle']")
    public WebElement adminOPDNewpatientsave;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement adminOPDNewpatientsuccesfully;

    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement adminOPDAddpatientappointmentDAte;

    @FindBy(xpath = "//span[@id='select2-consultant_doctor-container']")
    public WebElement adminOPDAddpatientconsulttantdoctor;

    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement adminOPDAddpatientconsulttantdoctortextbox;

    @FindBy(xpath = "(//*[@class=\"select2-selection__rendered\"])[5]")
    public WebElement adminOPDAddpatientcharge;

    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement adminOPDAddpatientchargetextbox;


    @FindBy(xpath = "(//*[@class=\"select2-selection__rendered\"])[4]")
    public WebElement adminOPDAddpatientchargecategory;

    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement adminOPDAddpatientchargecategorytextbox;

    @FindBy(xpath = "//*[@id=\"formaddbtn\"]/i")
    public WebElement adminOPDAddpatientsave;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement adminOPDAddpatientsuccesfully;

    @FindBy(xpath = "//label[normalize-space()='Applied Charge ($)']")
    public WebElement adminOPDADDpatientOPDconsultsationfees;

    @FindBy(xpath = "//div[@class='col-lg-4 col-md-4 col-sm-4 col-eq ptt10']//div[11]")
    public WebElement adminOPDAddpatientchargeconsultationfees;

    @FindBy(xpath = "//span[@id='select2-charge_category-cd-container']")
    public WebElement  adminOPDAddpatientconsulttantdoctorarzuvgarryyeva;

   @FindBy(xpath = "//td[@class='day weekend'][normalize-space()='30']")
    public WebElement  ADDpatientappointmentdate30;

   @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement ADDpatientappointmentdate;

   @FindBy(xpath = "//input[@id='apply_charge']")
    public WebElement Addpatientappliedcharge;

   @FindBy(xpath = "//input[@id='apply_amount']")
    public WebElement Addpatientamount;

   @FindBy(xpath = "//input[@id='paid_amount']")
    public WebElement Addpatientpaidamount;

   @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div/p")
    public WebElement addpetient;







}
