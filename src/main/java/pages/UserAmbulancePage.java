package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserAmbulancePage extends  BasePage {
    public UserAmbulancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //US_48
    @FindBy (xpath = "//*[text()=' Ambulance']")
    public WebElement userAmbulanceButton;

    @FindBy(xpath="//*[text()=' Ambulance Bill']")
    public WebElement userAmbulanceText;

    //@FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[1]")
   // public WebElement billNoTitle;
    @FindBy (xpath = "//*[@class='sorting_asc']")
    public WebElement billNoTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public  WebElement vehicleNumberTitle;

    @FindBy (xpath ="//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public  WebElement vehicleModelTitle;

    @FindBy (xpath ="//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public  WebElement driverNameTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement driverContactNumber;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public  WebElement amountTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[7]")
    public  WebElement taxTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[8]")
    public  WebElement netAmountTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[9]")
    public  WebElement paidAmountTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[10]")
    public WebElement balanceAmountTitle;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[11]")
    public  WebElement actionButton;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr/td[11]/a[1]/i")
    public  WebElement viewPaymentsButton;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/tbody/tr/td[11]/a[2]")
    public  WebElement showButton;

    @FindBy (xpath = "//*[@id='DataTables_Table_0']/tbody/tr/td[11]/button")
    public  WebElement payButton;

    @FindBy(xpath = "//*[@class=\"sorting\"]")
    public List<WebElement> ambulansBasliklarIlkList;

    @FindBy(xpath = "//*[@class=\"text-right sorting\"]")
    public List<WebElement> ambulansBasliklarIkinciList;
}
