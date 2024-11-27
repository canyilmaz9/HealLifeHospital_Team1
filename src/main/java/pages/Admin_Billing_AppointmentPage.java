package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelReader;
import java.util.List;

public class Admin_Billing_AppointmentPage extends BasePage {
    public Admin_Billing_AppointmentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    private static final Logger logger = LogManager.getLogger(Admin_Billing_AppointmentPage.class);

    @FindBy(id = "email")
    private WebElement adminUsernameBox;

    @FindBy(id = "password")
    private WebElement adminPasswordBox;

    @FindBy(className = "btn")
    private WebElement adminSigninBtn;


    public void adminSignin(String filePath, int usernameSheetIndex, int usernameRowIndex, int usernameColumnIndex,
                            int passwordSheetIndex, int passwordRowIndex, int passwordColumnIndex) {
        // ExcelReader'dan username ve password değerlerini çekiyoruz
        String username = ExcelReader.getCellData(filePath, usernameSheetIndex, usernameRowIndex, usernameColumnIndex);
        String password = ExcelReader.getCellData(filePath, passwordSheetIndex, passwordRowIndex, passwordColumnIndex);

        // Çekilen değerleri kontrol ediyoruz
        if (username != null && password != null) {
            logger.info("Excel'den çekilen kullanıcı adı: {"+username+"}");
            logger.info("Excel'den çekilen şifre: {"+password+"}");

            adminUsernameBox.sendKeys(username);
            adminPasswordBox.sendKeys(password);
            adminSigninBtn.click();
        } else {
            System.err.println("Kullanıcı adı veya şifre Excel'den okunamadı!");
        }
    }
    @FindBy(xpath = "//*[text()=\"Appointment\"]")
    public WebElement sidebarAppointmentLink;

    @FindBy(xpath = "//*[@class=\"sorting\"]")
    public List<WebElement> appointmentBasliklarList;

    @FindBy(xpath = "//*[@class=\"text-right dt-body-right sorting_disabled\"]")
    public WebElement appointmentStatusTitle;

    @FindBy(xpath = "//*[@type=\"search\"]")
    public WebElement appointmentSearchBox;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]")
    public WebElement appointmentDetailsTable;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[3]")
    public WebElement appointmentStatusShowBtn;

    @FindBy(xpath = "(//*[@class=\"label label-success\"])[1]")
    public WebElement appointmentStatusApprovedBox;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/h4")
    public WebElement appointmentDetailsWindowTitle;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]")
    public WebElement appointmentDoctorWiseBtn;

    @FindBy(xpath = "//*[@id=\"select2-doctor-container\"]")
    public WebElement appointmentDoctorWiseDoctorSelect;

    @FindBy(xpath = "//*[@id=\"select2-doctor-results\"]")
    public WebElement appointmentDoctorWiseDoctorBunyamin;

    @FindBy(xpath = "//*[@name=\"date\"]")
    public WebElement appointmentDoctorWiseDateSelect;

    @FindBy(xpath = "/html/body/div[6]/div[1]/table/tbody")
    public WebElement appointmentDoctorWiseDateDayTable;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[2]/form/button")
    public WebElement appointmentDoctorWiseSearchBox;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[2]")
    public WebElement appointmentDoctorQueueBtn;

    @FindBy(xpath = "//*[@id=\"doctor\"]")
    public WebElement appointmentDoctorQueueDoctorSelect;

    @FindBy(xpath = "//*[@id=\"global_shift\"]")
    public WebElement appointmentDoctorQueueShiftSelect;

    @FindBy(xpath = "//*[@id=\"slot\"]")
    public WebElement appointmentDoctorQueueSlotSelect;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[2]/form/div[2]/button")
    public WebElement appointmentDoctorQueueSearchBox;

    @FindBy(xpath = "//*[@id=\"23\"]/td[1]")
    public WebElement appointmentDoctorQueueSearchResult;


}