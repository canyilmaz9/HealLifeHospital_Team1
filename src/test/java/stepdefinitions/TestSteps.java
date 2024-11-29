package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TestPage;

public class TestSteps {
    private static final Logger logger = LogManager.getLogger(TestSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    TestPage testPage = new TestPage(driver);



}
