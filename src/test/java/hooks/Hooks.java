package hooks;

import AppPages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import Utils.Excelutils;
import java.io.FileInputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Hooks {
    public static Map<String, String> TESTDATA;

    public static WebDriver driver;
    public static LoginPage LP;
    public static HomepageafterLogin HP;
    public static LeavePage LeaveP;
    public static AdminPage AdminP;
    public static BuzzPage BuzzP;

    @Before
    public void Setup() throws Exception {

        // Load config.properties
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/test/resources/config.properties"));

        //Read values
        String browser       = prop.getProperty("browser");
        String executionMode = prop.getProperty("execution.mode");
        String hubURL        = prop.getProperty("hub.url");

        // Check execution mode
        if (executionMode.equalsIgnoreCase("remote")) {

            //REMOTE — Selenium Grid
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(new URL(hubURL), options);

            } else if (browser.equalsIgnoreCase("edge")) {
                EdgeOptions options = new EdgeOptions();
                driver = new RemoteWebDriver(new URL(hubURL), options);

            } else {
                throw new Exception("Browser not supported for Remote!");
            }

        } else {

            //LOCAL — Direct browser launch (No Grid needed)
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();

            } else {
                throw new Exception("Browser not supported for Local!");
            }
        }

        //Common settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Page Object initializations
        LP     = new LoginPage(driver);
        HP     = new HomepageafterLogin(driver);
        LeaveP = new LeavePage(driver);
        AdminP = new AdminPage(driver);
        BuzzP  = new BuzzPage(driver);
    }

    @After
    public void Teardown() {
        driver.quit();
    }
}