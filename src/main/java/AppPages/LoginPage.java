package AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class LoginPage
{
    WebDriver driver;
//    Constructor
    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

//    Locators
    @FindBy(xpath = "//*[@placeholder='Username']") WebElement Username;
    @FindBy(xpath = "//*[@placeholder='Password']") WebElement Password;
    @FindBy(xpath = "//*[@type = 'submit']") WebElement loginbutton;

// Methods
    public void EnterUsername(String uname){
        Username.sendKeys(uname);
    }
    public void EnterPassword(String Pwd){
        Password.sendKeys(Pwd);
    }
    public void ClickonLogin(){
        loginbutton.click();
    }

}
