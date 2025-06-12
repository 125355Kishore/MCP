package com.example.playwrightdemo.stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.playwrightdemo.selectors.Selectors;



public class PersonalAutoSteps {
    private final Selectors selectors = new Selectors();
    private final TestContext testContext;

    public PersonalAutoSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("user select PersonalAuto")
    public void userSelectPersonalAuto() {
        testContext.page.waitForSelector(selectors.personalauto);
        testContext.page.locator(selectors.personalauto).click();
        testContext.page.waitForTimeout(10000);
    }

    @When("user clicks on offering selection dropdown and chooses Basic program")
    public void userSelectsBasicProgram() {
        testContext.page.locator(selectors.offeringselectiondropdown).click();
        testContext.page.locator(selectors.offeringselectiondropdown).selectOption("Basic Program");
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next10")
    public void userClicksNext10() {
        testContext.page.locator(selectors.next10).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses Yes for the Is the applicant currently insured query")
    public void userSelectsCurrentlyInsuredYes() {
        testContext.page.locator(selectors.applicantinsureddropdown).click();
        testContext.page.locator(selectors.applicantinsureddropdown).selectOption("Yes");
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses Yes for the Is the applicant license currently suspended ,cancelled or revoked")
    public void userSelectsLicenseCurrentlyRevokedYes() {
        testContext.page.locator(selectors.yes).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses Yes for the Has the applicant license ever been cancelled,suspended or revoked")
    public void userSelectsLicenseEverRevokedYes() {
        testContext.page.locator(selectors.yes1).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses Yes for the Any drivers with convictions for moving traffice violations within the past three years")
    public void userSelectsDriverConvictionsYes() {
        testContext.page.locator(selectors.yes2).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user fills the text inside the please provide the driver name and explain the conviction")
    public void userFillsConvictionText() {
        testContext.page.waitForTimeout(2000);
        testContext.page.locator(selectors.textarea).click();
        testContext.page.locator(selectors.textarea).fill("Test");
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses Yes Has any policy or coverage been declined ,cancelled or non renewed during the prior three days")
    public void userSelectsPolicyDeclinedYes() {
        testContext.page.locator(selectors.yes3).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next11")
    public void userClicksNext11() {
        testContext.page.locator(selectors.next11).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next 12")
    public void userClicksNext12() {
        testContext.page.locator(selectors.next12).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on columns")
    public void userClicksColumns() {
        testContext.page.locator(selectors.columns).click();
        testContext.page.locator(selectors.columns).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next13")
    public void userClicksNext13() {
        testContext.page.locator(selectors.next13).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on columns 2")
    public void userClicksColumns2() {
        testContext.page.locator(selectors.columns2).click();
        testContext.page.locator(selectors.columns2).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next14")
    public void userClicksNext14() {
        testContext.page.locator(selectors.next14).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on columns 3")
    public void userClicksColumns3() {
        testContext.page.locator(selectors.columns3).click();
        testContext.page.locator(selectors.columns3).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next15")
    public void userClicksNext15() {
        testContext.page.locator(selectors.next15).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on the coverages1 in dropdown")
    public void userClicksCoverages1Dropdown() {
        testContext.page.locator(selectors.coverages1).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses the value from auto liabilty package dropdown")
    public void userSelectsAutoLiabilityPackage() {
        testContext.page.locator(selectors.autoliabilitydropdown).click();
        testContext.page.locator(selectors.autoliabilitydropdown).selectOption("15/30/5");
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses the value from the medical payments package dropdown")
    public void userSelectsMedicalPaymentsPackage() {
        testContext.page.locator(selectors.MedicalLimitdropdown).click();
        testContext.page.locator(selectors.MedicalLimitdropdown).selectOption("10,000");
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on Uninsured motorist property damage checkbox")
    public void userClicksUninsuredMotoristCheckbox() {
        testContext.page.locator(selectors.Uninsuredmotoristcheckbox).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on next16")
    public void userClicksNext16() {
        testContext.page.locator(selectors.next16).click();
        testContext.page.waitForTimeout(2000);
    }

    @When("user chooses the value from View issue blocking dropdown")
    public void userSelectsViewIssueBlocking() {
        testContext.page.locator(selectors.viewissueblocking).click();
        testContext.page.locator(selectors.viewissueblocking).selectOption("View All");
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on close options dropdown")
    public void userClicksCloseOptionsDropdown() {
        testContext.page.locator(selectors.closeoptions1).click();
        testContext.page.locator(selectors.closeoptions1).click();
        testContext.page.waitForTimeout(2000);
    }


}
