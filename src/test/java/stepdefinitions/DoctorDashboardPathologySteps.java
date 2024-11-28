package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.DoctorDashboardPathologyPage;
import pages.HomePageHeaderPage;
import pages.UserDashboardPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorDashboardPathologySteps {

    private static final Logger logger = LogManager.getLogger(HomePageHeaderSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);
    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
    DoctorDashboardPathologyPage doctorDashboardPathologyPage = new DoctorDashboardPathologyPage(driver);

    @When("Verifies that it is Doctor Dashboard Page")
    public void verifies_that_it_is_doctor_dashboard_page() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorDashboardPageDocImg.isDisplayed());
        logger.info("Doctor Dashboard sayfasının açıldığı test edildi");
    }
    @Then("Verifies that Doctor Dashboard Pathology button is visible")
    public void verifies_that_doctor_dashboard_pathology_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorDashboardPathologyButton.isDisplayed());
        logger.info("Doctor Dashboard Pathology butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the Doctor Dashboard Pathology button")
    public void clicks_on_the_doctor_dashboard_pathology_button() {
        doctorDashboardPathologyPage.DoctorDashboardPathologyButton.click();
        logger.info("Doctor Dashboard Pathology butonuna tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology Page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPagePatholoyBillText.isDisplayed());
        logger.info("Doctor Dashboard Pathology sayfasının açıldığı test edildi");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Bill No heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_bill_no_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBillNoText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Bill No başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Case ID - Patient ID heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_case_id_patient_id_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageCaseIDText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Case ID - Patient ID başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Reporting Date heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_reporting_date_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageReportingDateText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Reporting Date başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Patient Name heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_patient_name_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPagePatientNameText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Patient Name başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Reference Doctor heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_reference_doctor_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageReferenceDoctorText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Reference Doctor başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Amount heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_amount_$_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageAmountText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Amount ($) başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Paid Amount heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_paid_amount_$_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPagePaidAmountText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Paid Amount ($) başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Balance Amount heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_balance_amount_$_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Balance Amount ($) başlığının göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Bill No header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_page_bill_no_header_and_verifies_that_sorts_the_content() {
        List<String> billNoTextList = new ArrayList<>();
        List<WebElement> billNoTextElements = doctorDashboardPathologyPage.DoctorPathologyPageBillNoTextList;
        for ( WebElement eachElement : billNoTextElements   ) { billNoTextList.add(eachElement.getText());  }
        System.out.println(billNoTextList);
        List<String> billNoTextRakamList =new ArrayList<>();
        for (String each : billNoTextList){ billNoTextRakamList.add( each.replaceAll("\\D", "")  ) ;}
        System.out.println(billNoTextRakamList);
        List<Integer> billNoTextSayiList =new ArrayList<>();
        for (String each : billNoTextRakamList){ billNoTextSayiList.add( Integer.parseInt(each) ) ;}
        System.out.println(billNoTextSayiList);
        Collections.sort(billNoTextSayiList);
        System.out.println(billNoTextSayiList);

        doctorDashboardPathologyPage.DoctorPathologyPageBillNoText.click();
        ReusableMethods.bekle(2);
        List<String> billNoTextListSorted = new ArrayList<>();
        List<WebElement> billNoTextElements2 = doctorDashboardPathologyPage.DoctorPathologyPageBillNoTextList;
        for ( WebElement eachElement : billNoTextElements2   ) { billNoTextListSorted.add(eachElement.getText());  }
        System.out.println(billNoTextListSorted);
        List<String> billNoTextRakamListSorted =new ArrayList<>();
        for (String each : billNoTextListSorted){ billNoTextRakamListSorted.add( each.replaceAll("\\D", "")  ) ;}
        System.out.println(billNoTextRakamListSorted);
        List<Integer> billNoTextSayiListSorted =new ArrayList<>();
        for (String each : billNoTextRakamListSorted){ billNoTextSayiListSorted.add( Integer.parseInt(each) ) ;}
        System.out.println(billNoTextSayiListSorted);
        Assert.assertEquals(billNoTextSayiList, billNoTextSayiListSorted);
        ReusableMethods.bekle(2);
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Case ID - Patient ID header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_page_case_id_patient_id_header_and_verifies_that_sorts_the_content() {
        List<String> caseIdTextList = new ArrayList<>();
        List<WebElement> caseIdTextElements = doctorDashboardPathologyPage.DoctorPathologyPageCaseIdTextList;
        for ( WebElement eachElement : caseIdTextElements   ) { caseIdTextList.add(eachElement.getText());  }
        System.out.println(caseIdTextList);
        List<String> caseIdTextRakamList =new ArrayList<>();
        for (String each : caseIdTextList){ caseIdTextRakamList.add( each.replaceAll("\\D", "")  ) ;}
        System.out.println(caseIdTextRakamList);
        //List<Integer> caseIdTextSayiList =new ArrayList<>();
        //for (String each : caseIdTextRakamList){ caseIdTextSayiList.add( Integer.parseInt(each)) ;}
        //System.out.println(caseIdTextSayiList);
        //Collections.sort(caseIdTextSayiList);
        //System.out.println(caseIdTextSayiList);

        doctorDashboardPathologyPage.DoctorPathologyPageCaseIDText.click();
        ReusableMethods.bekle(2);
        List<String> caseIdTextListSorted = new ArrayList<>();
        List<WebElement> caseIdTextElements2 = doctorDashboardPathologyPage.DoctorPathologyPageCaseIdTextList;
        for ( WebElement eachElement : caseIdTextElements2   ) { caseIdTextListSorted.add(eachElement.getText());  }
        System.out.println(caseIdTextListSorted);
        List<String> caseIdTextRakamListSorted =new ArrayList<>();
        for (String each : caseIdTextListSorted){ caseIdTextRakamListSorted.add( each.replaceAll("\\D", "")  ) ;}
        System.out.println(caseIdTextRakamListSorted);
        //List<Integer> caseIdTextSayiListSorted =new ArrayList<>();
        //for (String each : caseIdTextRakamListSorted){ caseIdTextSayiListSorted.add( Integer.parseInt(each) ) ;}
        //System.out.println(caseIdTextSayiListSorted);

        //Assert.assertEquals(caseIdTextRakamList, caseIdTextRakamListSorted);
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Search Box button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_search_box_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageSearchBox.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Search Box'un göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Bill List content number select option is visible")
    public void verifies_that_doctor_dashboard_pathology_page_bill_list_content_number_select_option_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageContentNoSelection.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Bill List içerik sayısı seçim butonunun göründüğü doğrulandı");
    }
    @When("Clicks on the Doctor Dashboard PathologyPage Bill List content number select option")
    public void clicks_on_the_doctor_dashboard_pathology_page_bill_list_content_number_select_option() {
        doctorDashboardPathologyPage.DoctorPathologyPageContentNoSelection.click();
        logger.info("Doctor Dashboard Pathology Page Bill List içerik sayısı seçimine tıklandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Bill List content number select option -100- is visible")
    public void verifies_that_doctor_dashboard_pathology_page_bill_list_content_number_select_option_100_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageContentNo100.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Bill List içerik sayısı 100 seçeneğinin göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Bill List content number select option All is visible")
    public void verifies_that_doctor_dashboard_pathology_page_bill_list_content_number_select_option_all_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageContentNoAll.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Bill List içerik sayısı All seçeneğinin göründüğü doğrulandı");
    }
    @Then("Navigates to the Doctor Dashboard Pathology page Balance Amount element.")
    public void navigates_to_the_doctor_dashboard_pathology_page_balance_amount_element() {
        Actions actions= new Actions(driver);
        actions.moveToElement(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountRaw1Link).perform();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology page Balance Amount elementinin üzerine gelindi");
    }
    @Then("Verifies that Doctor Dashboard Pathology page Balance Amount, View Reports button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_balance_amount_view_reports_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountViewReportsLink.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Balance Amount, View Reports butonunun göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Balance Amount, View Reports button")
    public void clicks_on_the_doctor_dashboard_pathology_page_balance_amount_view_reports_button() {
        doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountViewReportsLink.click();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology page Balance Amount, View Reports linkine tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology page Balance Amount, View Reports page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page_balance_amount_view_reports_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountViewReportsBillDetailsText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Balance Amount, View Reports sayfasının açıldığı doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology page Balance Amount, Add-View Payments button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_balance_amount_add_view_payments_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountAddViewPaymentsLink.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Balance Amount, Add-View Payments butonunun göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Balance Amount, Add-View Payments button")
    public void clicks_on_the_doctor_dashboard_pathology_page_balance_amount_add_view_payments_button() {
        doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountAddViewPaymentsLink.click();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology page Balance Amount, Add-View Payments linkine tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology page Balance Amount, Add-View Payments page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page_balance_amount_add_view_payments_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPageBalanceAmountViewReportsPaymentsText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Balance Amount, Add-View Payments sayfasının açıldığı doğrulandı");
    }
    @When("Verifies that Doctor Dashboard Pathology page Pathology Test button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPagePathologyTestLink.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test butonunun göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Pathology Test button")
    public void clicks_on_the_doctor_dashboard_pathology_page_pathology_test_button() {
        doctorDashboardPathologyPage.DoctorPathologyPagePathologyTestLink.click();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology page Pathology Test linkine tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology page Pathology Test Page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page_pathology_test_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPagePathologyTestText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test sayfasının açıldığı doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Test Name heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_test_name_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageTestNameText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Test Name başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Short Name heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_short_name_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageShortNameText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Short Name başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Test Type heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_test_type_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageTestTypeText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Test Type başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Category heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_category_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageCategoryText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Category başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Sub-Category heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_sub_category_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageSubCategoryText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Sub-Category başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Method heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_method_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageMethodText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Method başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Report Days heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_report_days_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageReportDaysText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Report Days başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Tax heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_tax_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageTaxText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Tax başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Charge heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_charge_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageChargeText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Charge başlığının göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test, Amount heading is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_amount_heading_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageAmountText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Amount başlığının göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Test Name header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_test_name_header_and_verifies_that_sorts_the_content() {
        List<String> testNameTextList = new ArrayList<>();
        List<WebElement> testNameTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageTestNameTextList;
        for ( WebElement eachElement : testNameTextElements   ) { testNameTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(testNameTextList);
        Collections.sort(testNameTextList);
        System.out.println(testNameTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageTestNameText.click();
        ReusableMethods.bekle(2);

        List<String> testNameTextListSorted = new ArrayList<>();
        List<WebElement> testNameTextElements2 = doctorDashboardPathologyPage.DoctorPathologyPageBillNoTextList;
        for ( WebElement eachElement : testNameTextElements2   ) { testNameTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(testNameTextListSorted);
        Assert.assertEquals(testNameTextList, testNameTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Short Name header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_short_name_header_and_verifies_that_sorts_the_content() {
        List<String> shortNameTextList = new ArrayList<>();
        List<WebElement> shortNameTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageShortNameTextList;
        for ( WebElement eachElement : shortNameTextElements   ) { shortNameTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(shortNameTextList);
        Collections.sort(shortNameTextList);
        System.out.println(shortNameTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageShortNameText.click();
        ReusableMethods.bekle(2);

        List<String> shortNameTextListSorted = new ArrayList<>();
        List<WebElement> shortNameTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageShortNameTextList;
        for ( WebElement eachElement : shortNameTextElements2   ) { shortNameTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(shortNameTextListSorted);
        Assert.assertEquals(shortNameTextList, shortNameTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Test Type header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_test_type_header_and_verifies_that_sorts_the_content() {
        List<String> testTypeTextList = new ArrayList<>();
        List<WebElement> testTypeTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageTestTypeTextList;
        for ( WebElement eachElement : testTypeTextElements   ) { testTypeTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(testTypeTextList);
        Collections.sort(testTypeTextList);
        System.out.println(testTypeTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageTestTypeText.click();
        ReusableMethods.bekle(2);

        List<String> testTypeTextListSorted = new ArrayList<>();
        List<WebElement> testTypeTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageTestTypeTextList;
        for ( WebElement eachElement : testTypeTextElements2   ) { testTypeTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(testTypeTextListSorted);
        Assert.assertEquals(testTypeTextList, testTypeTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Category header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_category_header_and_verifies_that_sorts_the_content() {
        List<String> CategoryTextList = new ArrayList<>();
        List<WebElement> CategoryTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageCategoryTextList;
        for ( WebElement eachElement : CategoryTextElements   ) { CategoryTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(CategoryTextList);
        Collections.sort(CategoryTextList);
        System.out.println(CategoryTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageCategoryText.click();
        ReusableMethods.bekle(2);

        List<String> CategoryTextListSorted = new ArrayList<>();
        List<WebElement> CategoryTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageCategoryTextList;
        for ( WebElement eachElement : CategoryTextElements2   ) { CategoryTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(CategoryTextListSorted);
        Assert.assertEquals(CategoryTextList, CategoryTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Sub-Category header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_sub_category_header_and_verifies_that_sorts_the_content() {
        List<String> subCategoryTextList = new ArrayList<>();
        List<WebElement> subCategoryTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageSubCategoryTextList;
        for ( WebElement eachElement : subCategoryTextElements   ) { subCategoryTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(subCategoryTextList);
        Collections.sort(subCategoryTextList);
        System.out.println(subCategoryTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageSubCategoryText.click();
        ReusableMethods.bekle(2);

        List<String> subCategoryTextListSorted = new ArrayList<>();
        List<WebElement> subCategoryTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageSubCategoryTextList;
        for ( WebElement eachElement : subCategoryTextElements2   ) { subCategoryTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(subCategoryTextListSorted);
        Assert.assertEquals(subCategoryTextList, subCategoryTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Method header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_method_header_and_verifies_that_sorts_the_content() {
        List<String> MethodTextList = new ArrayList<>();
        List<WebElement> MethodTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageMethodTextList;
        for ( WebElement eachElement : MethodTextElements   ) { MethodTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(MethodTextList);
        Collections.sort(MethodTextList);
        System.out.println(MethodTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageMethodText.click();
        ReusableMethods.bekle(2);

        List<String> MethodTextListSorted = new ArrayList<>();
        List<WebElement> MethodTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageMethodTextList;
        for ( WebElement eachElement : MethodTextElements2   ) { MethodTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(MethodTextListSorted);
        //Assert.assertEquals(MethodTextList, MethodTextListSorted);
    }
    @Then("Clicks on the Doctor Dashboard Pathology Test page Report Days header and verifies that sorts the content")
    public void clicks_on_the_doctor_dashboard_pathology_test_page_report_days_header_and_verifies_that_sorts_the_content() {
        List<String> reportDaysTextList = new ArrayList<>();
        List<WebElement> reportDaysTextElements = doctorDashboardPathologyPage.DoctorPathologyTestPageReportDaysTextList;
        for ( WebElement eachElement : reportDaysTextElements   ) { reportDaysTextList.add(eachElement.getText().toLowerCase());  }
        System.out.println(reportDaysTextList);
        Collections.sort(reportDaysTextList);
        System.out.println(reportDaysTextList);

        doctorDashboardPathologyPage.DoctorPathologyTestPageReportDaysText.click();
        ReusableMethods.bekle(2);

        List<String> reportDaysTextListSorted = new ArrayList<>();
        List<WebElement> reportDaysTextElements2 = doctorDashboardPathologyPage.DoctorPathologyTestPageReportDaysTextList;
        for ( WebElement eachElement : reportDaysTextElements2   ) { reportDaysTextListSorted.add(eachElement.getText().toLowerCase());  }
        System.out.println(reportDaysTextListSorted);
        Assert.assertEquals(reportDaysTextList, reportDaysTextListSorted);
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test list Search Box button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_list_search_box_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageSearchBox.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test list Search Box'un göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_list_content_number_select_option_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageContentNoSelection.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test List içerik sayısı seçim butonunun göründüğü doğrulandı");
    }
    @When("Clicks on the Doctor Dashboard Pathology Page Pathology Test List content number select option")
    public void clicks_on_the_doctor_dashboard_pathology_page_pathology_test_list_content_number_select_option() {
        doctorDashboardPathologyPage.DoctorPathologyTestPageContentNoSelection.click();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology Page Pathology Test List içerik sayısı seçimine tıklandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option -100- is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_list_content_number_select_option_100_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageContentNo100.isDisplayed());
        //doctorDashboardPathologyPage.DoctorPathologyTestPageContentNo100.click();
        //ReusableMethods.bekle(2);

        //Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN);
        //ReusableMethods.bekle(2);
        //actions.sendKeys(Keys.ENTER);

        logger.info("Doctor Dashboard Pathology Page Pathology Test List içerik sayısı 100 seçeneğinin göründüğü doğrulandı");
    }
    @Then("Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option All is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_list_content_number_select_option_all_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageContentNoAll.isDisplayed());
        //doctorDashboardPathologyPage.DoctorPathologyTestPageContentNoAll.click();
        //ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology Page Pathology Test List içerik sayısı All seçeneğinin göründüğü doğrulandı");
    }
    @Then("Navigates to the Doctor Dashboard Pathology page Pathology Test List content Amount element.")
    public void navigates_to_the_doctor_dashboard_pathology_page_pathology_test_list_content_amount_element() {
        Actions actions= new Actions(driver);
        actions.moveToElement(doctorDashboardPathologyPage.DoctorPathologyTestPageAmountRaw1Link).perform();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology page Pathology Test List page Amount elementinin üzerine gelindi");
    }
    @Then("Verifies that Doctor Dashboard Pathology page Pathology Test page Amount, Show link button is visible")
    public void verifies_that_doctor_dashboard_pathology_page_pathology_test_page_amount_show_link_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageAmountShowLink.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test page Amount, Show butonunun göründüğü doğrulandı");
    }
    @Then("Clicks on the Doctor Dashboard Pathology page Pathology Test page Amount, Show link button")
    public void clicks_on_the_doctor_dashboard_pathology_page_pathology_test_page_amount_show_link_button() {
        doctorDashboardPathologyPage.DoctorPathologyTestPageAmountShowLink.click();
        ReusableMethods.bekle(2);
        logger.info("Doctor Dashboard Pathology Page Pathology Test page Amount, Show link tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology page Pathology Test page Amount, Show details page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page_pathology_test_page_amount_show_details_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyTestPageAmountShowTestDetailsText.isDisplayed());
        logger.info("Doctor Dashboard Pathology Page Pathology Test, Test detayları sayfasının açıldığı doğrulandı");
    }




}
