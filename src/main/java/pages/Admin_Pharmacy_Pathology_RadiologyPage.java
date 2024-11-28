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


    @FindBy(xpath = "//*[@class='box-header with-border']")
    public WebElement PathologyBillTexti;

    @FindBy(xpath = "//*[@aria-controls='testreport']")
    public List<WebElement> PathologyTestReportsList;

    @FindBy(xpath ="//*[@class='text-right white-space-nowrap dt-body-right sorting_disabled']")
    public WebElement BalanceAmount;

    @FindBy(xpath = "//*[@class='treeview active']")
    public WebElement PathologyButonu;

    @FindBy(xpath = "//*[@class='white-space-nowrap sorting']")
    public List<WebElement> PathologyBasliklar;

    @FindBy(xpath = "//*[@class='white-space-nowrap dt-body-right sorting']")
    public List<WebElement> AmountBasliklar;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement PathologySearch;





}
