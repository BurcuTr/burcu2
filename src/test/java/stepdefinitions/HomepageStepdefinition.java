package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class HomepageStepdefinition {

    HomePage homePage = new HomePage();


    @Given("User goes to {string} page")
    public void user_goes_to_page(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
        ReusableMethods.bekle(2);
    }

    @Then("Verify and Click on the Login Button on the Homepage")
    public void verify_and_click_on_the_login_button_on_the_homepage() {
        homePage.loginbutton.click();

    }

    @Then("User Logs in with username and password")
    public void user_logs_in_with_username_and_password() {
        homePage.username.click();
        homePage.username.sendKeys(ConfigReader.getProperty("username"));
        homePage.password.click();
        homePage.password.sendKeys(ConfigReader.getProperty("password"));
        homePage.signinbutton.click();
    }


    @Then("Verify StudentParent Dashboard Page")
    public void verify_student_parent_dashboard_page() {
        String str = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(str.contains("dashboard"));

    }

    @Then("Close the browser")
    public void close_the_browser() {
        Driver.getDriver().close();

    }

    //US_006
    //TC_001
    @Then("The user clicks on Course in the top menu of the Home page")
    public void the_user_clicks_on_course_in_the_top_menu_of_the_home_page() {
        homePage.coursebutton.click();

    }

    @Then("Confirms that you have been redirected to the Course page")
    public void confirms_that_you_have_been_redirected_to_the_course_page() {
        Assert.assertTrue(homePage.coursepage.isDisplayed());


    }

    //TC_002
    @Then("The user clicks on a lesson.")
    public void the_user_clicks_on_a_lesson() {
        homePage.englishandliterature.click();
        homePage.engdetails.click();
        Driver.getDriver().navigate().back();
        homePage.mathematics.click();
        homePage.matdetails.click();
        Driver.getDriver().navigate().back();
        homePage.sciences.click();
        homePage.sciencedetails.click();
        Driver.getDriver().navigate().back();
        homePage.socialsciences.click();
        homePage.socdetails.click();
        Driver.getDriver().navigate().back();
        homePage.history.click();
        homePage.histdetails.click();
        Driver.getDriver().navigate().back();
        homePage.artsandmusic.click();
        homePage.artdetails.click();
        Driver.getDriver().navigate().back();
        homePage.healthandexercisesciences.click();
        homePage.healthdetails.click();
        Driver.getDriver().navigate().back();
        homePage.foreignlanguage.click();
        homePage.foreigndetails.click();
        Driver.getDriver().navigate().back();
        homePage.computerscience.click();
        homePage.computerdetails.click();
    }

    @Then("The user views the course details.")
    public void the_user_views_the_course_details () {
        homePage.home.click();
    }

    @Then("The user exits the Course page.")
    public void exitstheCoursepage() {

        Driver.closeDriver();


    }
    //US_008
    //TC_001

    @When("Upon visiting the homepage, an Achievements section is displayed under the Achievements heading.")
    public void upon_visiting_the_homepage_an_achievements_section_is_displayed_under_the_achievements_heading() {
        Assert.assertTrue(homePage.acheivements.isDisplayed());
        homePage.acheivements.getText();

    }

    @Then("When I followed the steps to close the browser, the browser closed successfully and all open tabs were closed.")
    public void when_i_followed_the_steps_to_close_the_browser_the_browser_closed_successfully_and_all_open_tabs_were_closed() {
        Driver.closeDriver();
    }

    //TC_002
    @Given("Upon visiting the Achievements section, the following boards are displayed:")
    public void upon_visiting_the_achievements_section_the_following_boards_are_displayed() {
        Assert.assertTrue(homePage.acheivements.isDisplayed());
        homePage.acheivements.getText();
    }

    @Given("{int} Graduates")
    public void graduates(Integer int1) {
        Assert.assertTrue(homePage.graduates.isDisplayed());
        homePage.graduates.getText();

    }

    @Given("{int} Certified Teachers")
    public void certified_teachers(Integer int1) {

    }

    @Given("{int} Student Campuses")
    public void student_campuses(Integer int1) {

    }

    @Given("{int} Students")
    public void students(Integer int1) {

    }


}




