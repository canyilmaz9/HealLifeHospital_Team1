package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Admin_Pharmacy_Pathology_RadiologyPage extends BasePage {
    public Admin_Pharmacy_Pathology_RadiologyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[text()=' Pathology']")
    public WebElement userPagePathologyButton;


    @FindBy(xpath = "//th[@aria-label='Bill No: activate to sort column ascending']")
    public WebElement PathologyBillTexti;

    @FindBy(xpath = "//*[@aria-controls='testreport']")
    public List<WebElement> PathologyTestReportsList;

    @FindBy(xpath ="//*[@class='text-right white-space-nowrap dt-body-right sorting_disabled']")
    public WebElement BalanceAmount;

    @FindBy(xpath = "//span[normalize-space()='Pathology']")
    public WebElement PathologyButonu;

    @FindBy(xpath = "//*[@class='sorting']")
    public List<WebElement> PathologyBasliklar;

    @FindBy(xpath = "//*[@class='text-right sorting']")
    public List<WebElement> AmountBasliklar;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement PathologySearch;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement SearchResult;

    @FindBy(xpath = "//th[@aria-label='Bill No: activate to sort column descending']")
    public WebElement siralamaButonu;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public List<WebElement> BillNo;

    @FindBy(xpath = "//*[@class='text-right noExport sorting_desc']")
    public WebElement ActionButonu;

    @FindBy(xpath = "//span[normalize-space()='Radiology']")
    public WebElement RadiologyButonu;

    @FindBy(xpath = "//*[@class='sorting']")
    public List<WebElement> RadyologyBasliklar;

    @FindBy(xpath = "//span[normalize-space()='Radiology']")
    public WebElement AmountButonu;

    @FindBy(xpath = "//*[@class='text-right sorting']")
    public List<WebElement> PaidBalanceAmount;

    @FindBy(xpath = "//*[@class='text-right noExport sorting_asc']")
    public WebElement RadyologyAction;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement RadyologySearch;
}