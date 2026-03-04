package AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage {

    //Constructor
    WebDriver driver;
    public BuzzPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Webelements
    @FindBy (xpath = "//span[normalize-space()='Buzz' and @class ='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement Buzzlink;
    @FindBy (xpath = "//textarea[@class='oxd-buzz-post-input']") WebElement NewsfeedEntry;
    @FindBy (xpath = "//button[@type='submit']") WebElement Postbutton;
    @FindBy (xpath ="(//div[contains(@class,'orangehrm-buzz-post-body')]//p)[1]") WebElement Latestpost;
    @FindBy (xpath = "//i[@class='oxd-icon bi-heart-fill oxd-button-icon']") WebElement MostLikedPostoption;
    @FindBy (xpath = "(//*[@class='oxd-text oxd-text--p orangehrm-buzz-stats-active'])[1]") WebElement MostLikedpostlikecount;


    //Methods
    public void ClickBuzzLink() {
        Buzzlink.click();
    }
    public void ClickNewsfeedEntry(){
        NewsfeedEntry.click();
    }
    public void EnterNewsfeed(String news){
        NewsfeedEntry.clear();
        NewsfeedEntry.sendKeys(news);
    }
    public void ClickPost(){
        Postbutton.click();
    }
    public String GetLatestPost() {
        return Latestpost.getText();
    }
    public void refreshPage() {
        driver.navigate().refresh();
    }
    public void ClickMostlikedPost(){
        MostLikedPostoption.click();
    }
    public int GetMostlikedpostandcount(){
        String Mostlikedpostlikecounttext = MostLikedpostlikecount.getText();
        int likecount = Integer.parseInt(Mostlikedpostlikecounttext.split(" ")[0]);
        return likecount;
    }


}
