package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='he-title'])[1]")
    public WebElement anaSayfaInsurancePlansYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[2]")
    public WebElement pediatricServiceYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[3]")
    public WebElement labTestingYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[4]")
    public WebElement openingHoursYazisi;


    //US_005 icin locateler
    @FindBy (xpath = "//*[text()='Featured Services']")
    public WebElement featuredServicesTitle;

    @FindBy (xpath ="//*[text()='Nurse-to-Resident Ratio']")
    public  WebElement medicalTreatment;

    @FindBy (xpath = "//*[text()='Emergency Help']")
    public WebElement emergencyHelpTitle;

    @FindBy (xpath = "//*[text()='Onsite Medical Staff']")
    public WebElement qualifiedDoctorsTitle;

    @FindBy (xpath = "//*[text()='Communication All Parties']")
    public WebElement medicalProfessionalsTitle;

}
