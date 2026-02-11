package hooks;

import AppPages.HomepageafterLogin;
import AppPages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import AppPages.LeavePage;

import java.time.Duration;

public class Hooks {

    public static  WebDriver driver;
    public static LoginPage LP;
    public static HomepageafterLogin HP;
    public static LeavePage LeaveP;

    @Before
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LP = new LoginPage(driver);
        HP = new HomepageafterLogin(driver);
        LeaveP = new LeavePage(driver);
    }

    @After
    public void Teardown(){
        driver.quit();
    }
}
