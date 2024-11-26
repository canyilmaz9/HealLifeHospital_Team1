package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardPathologyPage extends BasePage{

    public DoctorDashboardPathologyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[text()='Pathology']")
    public WebElement DoctorDashboardPathologyButton;

    @FindBy(xpath="//*[text()='Pathology Bill']")
    public WebElement DoctorPathologyPagePatholoyBillText;

    @FindBy(xpath="//img[@class='topuser-image']")
    public WebElement DoctorDashboardPageDocImg;

    @FindBy(xpath="//*[text()='Bill No']")
    public WebElement DoctorPathologyPageBillNoText;

    @FindBy(xpath="//*[text()='Case ID / Patient ID']")
    public WebElement DoctorPathologyPageCaseIDText;

    @FindBy(xpath="//*[text()='Reporting Date']")
    public WebElement DoctorPathologyPageReportingDateText;

    @FindBy(xpath="//*[text()='Patient Name']")
    public WebElement DoctorPathologyPagePatientNameText;

    @FindBy(xpath="//*[text()='Reference Doctor']")
    public WebElement DoctorPathologyPageReferenceDoctorText;

    @FindBy(xpath="//*[text()='Amount ($)']")
    public WebElement DoctorPathologyPageAmountText;

    @FindBy(xpath="//*[text()='Paid Amount ($)']")
    public WebElement DoctorPathologyPagePaidAmountText;

    @FindBy(xpath="//*[text()='Balance Amount ($)']")
    public WebElement DoctorPathologyPageBalanceAmountText;

    @FindBy(xpath="//input[@type='search']")
    public WebElement DoctorPathologyPageSearchBox;

    @FindBy(xpath="//select[@name='testreport_length']")
    public WebElement DoctorPathologyPageContentNoSelection;

    @FindBy(xpath="//option[text()='100']")
    public WebElement DoctorPathologyPageContentNo100;

    @FindBy(xpath="//option[text()='All']")
    public WebElement DoctorPathologyPageContentNoAll;

    @FindBy(xpath="(//td[@class=' dt-body-right'])[3]")
    public WebElement DoctorPathologyPageBalanceAmountRaw1Link;

    @FindBy(xpath="(//i[@class='fa fa-reorder'])[2]")
    public WebElement DoctorPathologyPageBalanceAmountViewReportsLink;

    @FindBy(xpath="(//h4[text()='Bill Details'])[1]")
    public WebElement DoctorPathologyPageBalanceAmountViewReportsBillDetailsText;

    @FindBy(xpath="(//a[@data-original-title='Add / View Payments'])[1]")
    public WebElement DoctorPathologyPageBalanceAmountAddViewPaymentsLink;

    @FindBy(xpath="//h4[text()='Payments']")
    public WebElement DoctorPathologyPageBalanceAmountViewReportsPaymentsText;

    @FindBy(xpath="//*[text()=' Pathology Test']")
    public WebElement DoctorPathologyPagePathologyTestLink;

    @FindBy(xpath="(//*[text()='Pathology Test'])[1]")
    public WebElement DoctorPathologyTestPagePathologyTestText;

    @FindBy(xpath="//*[text()='Test Name']")
    public WebElement DoctorPathologyTestPageTestNameText;

    @FindBy(xpath="//*[text()='Short Name']")
    public WebElement DoctorPathologyTestPageShortNameText;

    @FindBy(xpath="//*[text()='Test Type']")
    public WebElement DoctorPathologyTestPageTestTypeText;

    @FindBy(xpath="//*[text()='Category']")
    public WebElement DoctorPathologyTestPageCategoryText;

    @FindBy(xpath="//*[text()='Sub Category']")
    public WebElement DoctorPathologyTestPageSubCategoryText;

    @FindBy(xpath="//*[text()='Method']")
    public WebElement DoctorPathologyTestPageMethodText;

    @FindBy(xpath="//*[text()='Report Days']")
    public WebElement DoctorPathologyTestPageReportDaysText;

    @FindBy(xpath="//*[text()='Tax (%)']")
    public WebElement DoctorPathologyTestPageTaxText;

    @FindBy(xpath="//*[text()='Charge ($)']")
    public WebElement DoctorPathologyTestPageChargeText;

    @FindBy(xpath="//*[text()='Amount ($)']")
    public WebElement DoctorPathologyTestPageAmountText;

    @FindBy(xpath="//input[@type='search']")
    public WebElement DoctorPathologyTestPageSearchBox;

    @FindBy(xpath="//select[@name='DataTables_Table_0_length']")
    public WebElement DoctorPathologyTestPageContentNoSelection;

    @FindBy(xpath="//option[text()='100']")
    public WebElement DoctorPathologyTestPageContentNo100;

    @FindBy(xpath="//option[text()='All']")
    public WebElement DoctorPathologyTestPageContentNoAll;

    @FindBy(xpath="(//td[@class=' dt-body-right'])[3]")
    public WebElement DoctorPathologyTestPageAmountRaw1Link;

    @FindBy(xpath="(//i[@class='fa fa-reorder'])[2]")
    public WebElement DoctorPathologyTestPageAmountShowLink;

    @FindBy(xpath="(//h4[@class='modal-title'])[1]")
    public WebElement DoctorPathologyTestPageAmountShowTestDetailsText;







}
