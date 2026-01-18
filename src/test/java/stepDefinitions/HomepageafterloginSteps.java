package stepDefinitions;

import AppPages.HomepageafterLogin;
import AppPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import static hooks.Hooks.*;

public class HomepageafterloginSteps {

    @Then("Verify the Homepage Logo afterlogin")
    public void Verifyiconafterlogin(){
        boolean STATUS = HP.Verify_Logo_Afterlogin();
        Assert.assertTrue(STATUS);
    }

    @Then("Click on Adminlink")
    public void ClickAdmin(){
        HP.ClcikonAdminLink();
    }
    @Then("Verify the Logout")
    public void Verify_Logout(){
        HP.ClickUserProfileDropdown();
        HP.Logout();
    }
}
