package stepDefinitions;

import static hooks.Hooks.*;
import java.util.List;
import io.cucumber.java.en.*;
import AppPages.AdminPage;

public class AdminPagesteps {
    @Then("Click On User management")
    public void clickOnUserManagement() throws Exception {
        AdminP.Tap_User_Management();
    }

    @Then ("Enter User {string} and Search")
    public void enterUserAndSearch(String Username) {
        AdminP.Enter_User_and_Search(Username);
    }
    @Then("Find the User {string} in the System users")
    public void findTheUserInTheSystemUsers(String Username) throws InterruptedException {
        AdminP.FindtheUsername(Username);
    }
}
