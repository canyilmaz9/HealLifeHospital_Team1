package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage extends BasePage{

    public AdminDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//*[@class='treeview active']")
        public WebElement dashboardTitle;

        @FindBy(xpath = "//span[text()=' Billing'")
        public WebElement billingTitle;

        @FindBy(xpath = "//span[text()=' Appointment'")
        public WebElement appointmentTitle;

        @FindBy(xpath = "//span[text()=' OPD'")
        public WebElement opdTitle;

        @FindBy(xpath = "//span[text()=' IPD'")
        public WebElement ipdTitle;

        @FindBy(xpath = "//span[text()=' Pharmacy'")
        public WebElement pharmacyTitle;

        @FindBy(xpath = "//span[text()=' Pathology'")
        public WebElement pathologyTitle;

        @FindBy(xpath = "//span[text()=' Radiology'")
        public WebElement radiologyTitle;

        @FindBy(xpath = "//span[text()=' Blood Bank'")
        public WebElement bloodbankTitle;

        @FindBy(xpath = "//span[text()=' Ambulance'")
        public WebElement ambulanceTitle;

        @FindBy(xpath = "//span[text()=' Birth & Death Record'")
        public WebElement birthAndDeathTitle;

        @FindBy(xpath = "//span[text()=' Human Resource'")
        public WebElement humanResourceTitle;

        @FindBy(xpath = "//span[text()=' TPA Management'")
        public WebElement tpaManagementTitle;

        @FindBy(xpath = "//span[text()=' Finance'")
        public WebElement FinanceTitle;

        @FindBy(xpath = "//span[text()=' Messaging'")
        public WebElement messagingTitle;

        @FindBy(xpath = "//span[text()=' TPA Inventory'")
        public WebElement inventoryTitle;

        @FindBy(xpath = "//span[text()=' Certificate'")
        public WebElement certificateTitle;










    }



