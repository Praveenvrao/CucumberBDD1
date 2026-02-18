package stepDefinitions;

import AppPages.LoginPage;
import Utils.Excelutils;
import io.cucumber.java.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import static hooks.Hooks.driver;
import static hooks.Hooks.LP;

import java.util.HashMap;
import java.util.Map;



public class Loginpagesteps {

    Map<String, String> TESTDATA = new HashMap<>();

    @When("Hit the OrangeHRM URL")
    public void hit_the_orange_hrm_url() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Then("Verifying the OrangeHRM Logo on Homepage")
    public void verifying_the_orange_hrm_logo_on_homepage() {
        boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }

    @Then("Verifying the Orange Hrm hyperlink on homepage")
    public void Verifying_OrangeHRM_Hyperlink(){
        boolean status = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Then("Enter {string} and {string} credentials")
    public void Enter_Creds(String Uname, String password) throws Exception {
        Thread.sleep(2000);
        LP.EnterUsername(Uname);
        LP.EnterPassword(password);
    }

    @Then("Click on LoginButton")
    public void ClickLogin(){
        LP.ClickonLogin();
    }

    @Then("Login with {string} User")
    public void LoginwithUser(String TestcaseID){
        TESTDATA = Excelutils.getTestdata(TestcaseID);

        String User = TESTDATA.get("User");
        String Password = TESTDATA.get("Password");

        LP.EnterUsername(User);
        LP.EnterPassword(Password);
        LP.ClickonLogin();
    }
}
