package stepDefinitions;
import static hooks.Hooks.driver;
import static hooks.Hooks.LeaveP;
import io.cucumber.java.en.*;

public class LeavePagesteps {
    @Then("Click on Leave")
    public void click_on_leave() throws InterruptedException {
        Thread.sleep(2000);
        LeaveP.ClickLeavePage();
    }
    @Then("Click on Apply option in Leave")
    public void click_on_apply_option_in_leave() {
        LeaveP.ClickApplyLeave();
    }
    @Then("Apply the CAN Leave")
    public void apply_the_can_leave() {
        LeaveP.Applyingleaves();
        System.out.println(LeaveP.Applyingleaves());
    }

}
