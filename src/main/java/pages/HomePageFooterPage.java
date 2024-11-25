package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageFooterPage extends BasePage{

    public HomePageFooterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class='complain']/a")
    //@FindBy(xpath ="//*[@class='complain']" )
    public WebElement complainTitleLink;

    @FindBy(xpath = "//*[@class='fa fa-pencil-square']")
    public WebElement complainIconLink;



}
