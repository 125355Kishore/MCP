
package com.example.playwrightdemo.stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.example.playwrightdemo.stepdefs.TestContext;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.playwrightdemo.selectors.Selectors;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;



public class CommercialAutoSteps {
    private final Selectors selectors = new Selectors();
    private final TestContext testContext;

    public CommercialAutoSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("user clicks on the fleet dropdwon and chooses {int} or more options")
    public void user_clicks_on_the_fleet_dropdwon_and_chooses_or_more_options(Integer int1) {
        testContext.page.click(selectors.fleetdropdown);
        testContext.page.selectOption(selectors.fleetdropdown, int1 + " or more units");
        testContext.page.waitForTimeout(2000);
    }

    @Given("user navigates to the URL")
    public void userNavigatesToTheURL() {
        testContext.page.navigate("https://pc-sandbox-gwcpdev.hexaware.zeta1-andromeda.guidewire.net/PolicyCenter.do");
        testContext.page.waitForTimeout(2000);
    }

    @When("user enters username")
    public void userEntersUsername() {
        // Wait for the username field to be visible before filling
        testContext.page.waitForSelector(selectors.username, new Page.WaitForSelectorOptions().setTimeout(30000));
        testContext.page.fill(selectors.username, "su");
        testContext.page.waitForTimeout(2000);
    }

    @When("user enters password")
    public void userEntersPassword() {
        testContext.page.fill(selectors.password, "gw");
    }

    @When("user clicks on login")
    public void userClicksOnLogin() {
        testContext.page.click(selectors.login);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on account")
    public void userClicksOnAccount() {
        testContext.page.click(selectors.Accountab);
        testContext.page.waitForTimeout(2000);
    }

    @When("user can click on New Submission")
    public void userClicksNewSubmission() {
        testContext.page.click(selectors.NewSubmission);
        testContext.page.waitForTimeout(2000);
    }

    @When("user select CommercialAuto")
    public void userSelectCommercialAuto() {
        testContext.page.click(selectors.CommercialAuto);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the offering selection dropdown and chooses Standard Option")
    public void userSelectsStandardOption() {
        testContext.page.click(selectors.selectiondropdown);
        testContext.page.selectOption(selectors.selectiondropdown, "Standard");
        testContext.page.waitForTimeout(2000);
    }

    @When("user click on next")
    public void userClickOnNext() {
        testContext.page.click(selectors.next);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next button")
    public void userClicksOnNextButton() {
        testContext.page.click(selectors.nextbutton);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on organization dropdown")
    public void userClicksOnOrganizationDropdown() {
        testContext.page.click(selectors.organizationdropdown);
        testContext.page.waitForTimeout(2000);
        testContext.page.click(selectors.organizationdropdown);
    }

    @When("user clicks on next1")
    public void userClicksOnNext1() {
        testContext.page.click(selectors.next1);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the coverages in dropdown")
    public void userClicksOnCoverageDropdown() {
        testContext.page.click(selectors.coveragedropdown);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the product dropdown and chooses Business Auto option")
    public void userSelectsBusinessAuto() {
        testContext.page.click(selectors.productdropdown);
        testContext.page.selectOption(selectors.productdropdown, "Business Auto");
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the fleet dropdown and chooses 10 or more options")
    public void userSelectsFleetOption() {
        testContext.page.click(selectors.fleetdropdown);
        testContext.page.selectOption(selectors.fleetdropdown, "10 or more units");
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on save draft button")
    public void userClicksOnSaveDraft() {
        testContext.page.click(selectors.savedraft);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next2")
    public void userClicksOnNext2() {
        testContext.page.click(selectors.next2);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on primarycheckbox")
    public void userClicksOnPrimaryCheckbox() {
        testContext.page.click(selectors.primarycheckbox);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next3")
    public void userClicksOnNext3() {
        testContext.page.click(selectors.next3);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next4")
    public void userClicksOnNext4() {
        testContext.page.click(selectors.next3); // Assuming this is intentional
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the togglecolumnicon")
    public void userClicksOnToggleColumnIcon() {
        testContext.page.click(selectors.togglecolumniconicon);
        testContext.page.click(selectors.togglecolumniconicon);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next5")
    public void userClicksOnNext5() {
        testContext.page.click(selectors.next5);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the togglecolumnicon1")
    public void userClicksOnToggleColumnIcon1() {
        testContext.page.click(selectors.togglecolumnicon1);
        testContext.page.click(selectors.togglecolumnicon1);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on save draft1 button")
    public void userClicksOnSaveDraft1() {
        testContext.page.click(selectors.savedraft1);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next6")
    public void userClicksOnNext6() {
        testContext.page.click(selectors.next5); // Assuming next6 uses same selector
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the togglecolumnicon2")
    public void userClicksOnToggleColumnIcon2() {
        testContext.page.click(selectors.togglecolumnicon2);
        testContext.page.click(selectors.togglecolumnicon2);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next7")
    public void userClicksOnNext7() {
        testContext.page.click(selectors.next5); // Assuming same selector reused
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next8")
    public void userClicksOnNext8() {
        testContext.page.click(selectors.next5);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next9")
    public void userClicksOnNext9() {
        testContext.page.click(selectors.next5);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on close option")
    public void userClicksOnCloseOption() {
        testContext.page.click(selectors.closeoptions);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on NotTaken option")
    public void userClicksOnNotTakenOption() {
        testContext.page.click(selectors.Nottaken);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on Reason code dropdwon and chooses Policy not taken option")
    public void userSelectsReasonCodeOption() {
        testContext.page.click(selectors.Reasoncode);
        testContext.page.selectOption(selectors.Reasoncode, "Policy not-taken");
        testContext.page.waitForTimeout(2000);
    }

    @When("user enters the reasontext")
    public void userEntersReasonText() {
        testContext.page.waitForTimeout(2000);
        testContext.page.click(selectors.Reasontext);
        testContext.page.fill(selectors.Reasontext, "Not now");
        testContext.page.waitForTimeout(2000);
    }

    @Then("user clicks on nottaken button")
    public void userClicksOnNotTakenButton() {
        testContext.page.click(selectors.Nottakenbutton);
        testContext.page.waitForTimeout(2000);
        testContext.cleanup();
    }

}
