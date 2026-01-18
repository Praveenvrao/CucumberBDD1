package AppPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageafterLogin {

//    Constructor
    WebDriver driver;
    public HomepageafterLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Locators
    @FindBy(xpath = "//*[@alt= 'client brand banner']") WebElement homeimg;
    @FindBy(xpath="//li[1]//a[1]//span[1]") WebElement Adminlink;
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']") WebElement Userprofiledropdown;
    @FindBy(xpath = "//*[contains(text(), 'Logout')]") WebElement Logoutlink;

//    Methods
    public boolean Verify_Logo_Afterlogin(){
        boolean homestatus = homeimg.isDisplayed();
        return homestatus;
    }
    public void ClcikonAdminLink(){
        Adminlink.click();
    }
    public void ClickUserProfileDropdown(){
        Userprofiledropdown.click();
    }
    public void Logout(){
        Logoutlink.click();
    }
}
