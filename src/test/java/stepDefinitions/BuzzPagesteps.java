package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import AppPages.BuzzPage.*;
import static hooks.Hooks.*;
import java.util.Map;
import java.util.HashMap;
import Utils.Excelutils;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.JavascriptExecutor;

public class BuzzPagesteps {

    @Then("click on Buzz link")
    public void ClickonBuzzlink() {
        BuzzP.ClickBuzzLink();
    }

    @Then("click on Buzz newsfeed")
    public void ClickonBuzznewsfeed() {
        BuzzP.ClickNewsfeedEntry();
    }

    @Then("Write and post the buzzpost")
    public void Writeandpostthebuzzpost() throws  InterruptedException {
        String News = TESTDATA.get("News");
        BuzzP.EnterNewsfeed(News);
        BuzzP.ClickPost();
    }

    @Then("Verify the posted Buzzpost in newsfeed")
    public void VerifytheBuzzpostinnewsfeed() throws   InterruptedException {
        BuzzP.refreshPage();
        Thread.sleep(2000);
        System.out.println(BuzzP.GetLatestPost());
        Assert.assertEquals(TESTDATA.get("News"), BuzzP.GetLatestPost());
    }

    @Then("click on Mostliked Posts option")
    public void clickonMostlikedPostsoption() {
        BuzzP.ClickMostlikedPost();
    }

    @Then("Verify the Most liked Buzzpost and count the number of likes")
    public void VerifytheMostlikedBuzzpostandcountthenumberoflikes() throws InterruptedException {
        Thread.sleep(2000);
        int likesnumber = BuzzP.GetMostlikedpostandcount();
        System.out.println("The number of likes for the most liked post is: " + likesnumber);
    }
}
