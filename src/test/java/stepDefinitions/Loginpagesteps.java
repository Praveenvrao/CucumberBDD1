package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

public class Loginpagesteps {
    WebDriver driver;

    @Given("I launch the Chrome browser")
    public void i_launch_the_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
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

}
