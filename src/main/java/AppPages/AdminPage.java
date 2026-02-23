package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminPage {

    //Constructor
    WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy (xpath = "//span[normalize-space()='User Management']") WebElement User_Management;
    @FindBy (xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement User_Input;
    @FindBy (xpath = "//button[normalize-space()='Search']") WebElement Search;
    @FindBy (xpath = "//div[@class='oxd-table-body' and @role ='rowgroup']/div")
    List<WebElement> Table_Rows;
    @FindBy (xpath = "//a[normalize-space()='Users']") WebElement Users;

    //Methods
    public void Tap_User_Management() throws Exception{
        User_Management.click();
        Thread.sleep(2000);
        Users.click();
    }
    public void Enter_User_and_Search(String Adminname){
        User_Input.clear();
        User_Input.sendKeys(Adminname);
        Search.click();
    }
    public int Get_Table_Row_Count(){
        return Table_Rows.size();
    }

    public boolean FindtheUsername(String Username) throws InterruptedException {
        Thread.sleep(3000);
        boolean Userfound = false;

        for(int i=1;i<=Get_Table_Row_Count(); i++){
            //WebElement table = Table_Rows.get(i);
            String UName = driver.findElement(By.xpath("//div[@class='oxd-table-body' and @role ='rowgroup']/div["+i+"]/div/div[2]")).getText();
            //String UName = table.findElement(By.xpath("/div/div[2]")).getText();
            if(UName.equals(Username)) {
                Userfound = true;
                System.out.println(UName);
            }

        }
        return Userfound;
    }
}
