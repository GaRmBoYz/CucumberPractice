package steps;

import impl.UserMgtImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class UserMgtSteps {
    UserMgtImpl impl = new UserMgtImpl();

    @When("I open User-Mgt page")
    public void i_open_user_mgt_page() {
        impl.getPage().userMgtLink.click();
    }

    @Then("Title of the page should be Register New User")
    public void title_of_the_page_should_be_register_new_user() {
        Assert.assertEquals("Register New User", WebDriverUtils.getDriver().getTitle());
    }

    @Then("I should see Login button")
    public void i_should_see_login_button() {
        Assert.assertTrue(impl.getPage().loginBtn.isEnabled());
    }

    @Then("I should see Access DB button")
    public void i_should_see_access_db_button() {
        Assert.assertTrue(impl.getPage().accessDbBtn.isEnabled());
    }

    @When("I click Access DB button")
    public void i_open_access_DB_page() {
        impl.openLinkInNewWindowAndSwitch("Access DB");;
    }

    @Then("Title of the page should be User DB")
    public void i_should_see_user_db_title() {
        Assert.assertEquals("User DB", WebDriverUtils.getDriver().getTitle());
    }

    @When("I click LOGIN button")
    public void i_open_login_page() {
        impl.openLinkInNewWindowAndSwitch("LOGIN");
    }

    @Then("Title of the page should be Login Page")
    public void i_should_see_login_page_title() {
        Assert.assertEquals("Login Page", WebDriverUtils.getDriver().getTitle());
    }

    @Then("I should see TLA image loaded")
    public void i_should_see_tla_image_loaded() {
        Assert.assertTrue(impl.getPage().image.isDisplayed());
    }
}