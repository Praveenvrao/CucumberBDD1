package hooks;

import AppPages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Map;
import Utils.Excelutils;
import java.util.HashMap;

public class Hooks {
    public static Map<String, String> TESTDATA;

    public static  WebDriver driver;
    public static LoginPage LP;
    public static HomepageafterLogin HP;
    public static LeavePage LeaveP;
    public static AdminPage AdminP;
    public static BuzzPage BuzzP;

    @Before
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LP = new LoginPage(driver);
        HP = new HomepageafterLogin(driver);
        LeaveP = new LeavePage(driver);
        AdminP = new AdminPage(driver);
        BuzzP = new BuzzPage(driver);
    }

    @After
    public void Teardown(){
        driver.quit();
    }

}
