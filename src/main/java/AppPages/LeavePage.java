package AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

    // Constructor
    WebDriver driver;
    public LeavePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy (xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")
    WebElement LeaveLink;
    @FindBy (xpath = "//*[normalize-space()='Apply']") WebElement ApplyLink;
    @FindBy (xpath = "//*[normalize-space()='No Leave Types with Leave Balance']") WebElement NoLeavesText;


    public void ClickLeavePage(){
        LeaveLink.click();
    }
    public void ClickApplyLeave(){
        ApplyLink.click();
    }
    public String Applyingleaves(){
        String Noleavesmsg = null;
        if(NoLeavesText.isDisplayed()){
            Noleavesmsg = NoLeavesText.getText();
        }
        return Noleavesmsg;
    }
}
