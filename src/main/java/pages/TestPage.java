package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage{
    public TestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
