package com.example.playwrightdemo.stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.playwrightdemo.selectors.Selectors;




public class GeneralLiability {
    private final Selectors selectors = new Selectors();
    private final TestContext testContext;

    public GeneralLiability(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("user selects General Liability")
    public void userSelectsGeneralLiability() {
        testContext.page.click(selectors.GeneralLiab);
        testContext.page.waitForTimeout(1000);
        System.out.println("User selects General Liability");
    }

    @When("user selects offering selection")
    public void userSelectsOfferingSelection() {
        testContext.page.click(selectors.offeringSelection);
        testContext.page.selectOption(selectors.offeringSelection, "GL Standard");
        testContext.page.waitForTimeout(1000);
        System.out.println("User selects Offering Selection");
    }

    @When("user selects next on Offering Selection")
    public void userSelectsNextOnOfferingSelection() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(1000);
        System.out.println("User clicks on Next");
    }

    @When("user answers GL PreQualification")
    public void userAnswersGLPreQualification() {
        testContext.page.click(selectors.GLPreQualification);
        for (int i = 0; i < 4; i++) {
            testContext.page.keyboard().press("Tab");
            testContext.page.keyboard().press("ArrowLeft");
            testContext.page.waitForTimeout(1000);
        }
        testContext.page.waitForTimeout(1000);
        System.out.println("User enters answers for questions");
    }

    @When("user next on GLpage")
    public void userNextOnGLPage() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(1000);
        System.out.println("User clicks on Next");
    }

    @When("user enters value for Estimated premium")
    public void userEntersEstimatedPremium() {
        testContext.page.fill(selectors.Estprimenm, "45000");
    }

    @When("user enters value for Date quote")
    public void userEntersDateQuote() {
        testContext.page.fill(selectors.Datequote, "06/17/2025");
        testContext.page.waitForTimeout(1000);
    }

    // @When("user enters value in policy info")
    // public void userEntersPolicyInfo() {
    //     testContext.page.fill(selectors.Industrialcode, " ");
    //     testContext.page.fill(selectors.Industrialcode, "1541");
    //     testContext.page.click(selectors.deleteSSNdropdown);
    //     testContext.page.click(selectors.deleteSSN);
    //     testContext.page.fill(selectors.SSN, "465-45-4765");
    //     testContext.page.waitForTimeout(500);
    //     System.out.println("User enters all mandatory value in Policy info");
    // }

    
@When("user enters value in policy info")
public void userEntersValueInPolicyInfo() {
    testContext.page.fill(selectors.Industrialcode, " ");
    testContext.page.fill(selectors.Industrialcode, "1541");
    testContext.page.click(selectors.deleteSSNdropdown);
    testContext.page.click(selectors.deleteSSN);
    testContext.page.fill(selectors.SSN, "465-45-4765");
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(2000);
    System.out.println("User enters all mandatory value in Policy info");
}

    @When("user click next on Location page")
    public void userClickNextOnLocationPage() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(2000);
    }

    @When("user clicks on Additional Coverages")
    public void userClicksOnAdditionalCoverages() {
        // TODO: Define selectors.AdditionalCoverages and selectors.AddCoverage in Selectors.java
        testContext.page.click(selectors.AdditionalCoverages);
        testContext.page.click(selectors.AddCoverage);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicks on Additional Coverages");
    }

    @When("user add select Category")
    public void userAddSelectCategory() {
        // TODO: Define selectors.SelectCat, selectors.SearchGL, selectors.EmploymentCoverage, selectors.AddSelecedCoverages in Selectors.java
        testContext.page.click(selectors.SelectCat);
        testContext.page.waitForTimeout(500);
        testContext.page.selectOption(selectors.SelectCat, "EMPLOYMENT");
        testContext.page.waitForTimeout(500);
        testContext.page.click(selectors.SearchGL);
        testContext.page.click(selectors.EmploymentCoverage);
        testContext.page.waitForTimeout(500);
        testContext.page.click(selectors.AddSelecedCoverages);
        testContext.page.waitForTimeout(500);
        System.out.println("User adds Additional Coverages and additional details");
    }

    @When("user click on next on GL page")
    public void userClickOnNextOnGLPage() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicks Next on Location page");
    }
@When("user add Additional Coverages and additional details")
    public void userAddAdditionalCoveragesAndDetails() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(2000);
}

@When("user clicks on Add Exposure")
    public void userClicksOnAddExposure() {
    // TODO: Define selectors.Addexposure in Selectors.java
    testContext.page.click(selectors.Addexposure);
}

@When("user add location")
    public void userAddLocation() {
    // TODO: Define selectors.Addlocation in Selectors.java
    testContext.page.click(selectors.Addlocation);
    testContext.page.waitForTimeout(500);
    testContext.page.selectOption(selectors.Addlocation, "1: 2850 S. Delaware St., San Mateo, CA");
    testContext.page.keyboard().press("Tab");
}

@When("user add class code")
    public void userAddClassCode() {
    // TODO: Define selectors.Addclass in Selectors.java
    testContext.page.fill(selectors.Addclass, "0050");
    testContext.page.keyboard().press("Tab");
    testContext.page.keyboard().press("Tab");
}

@When("user add basic amount")
    public void userAddBasicAmount() {
    // TODO: Define selectors.Addbasicamount in Selectors.java
    testContext.page.fill(selectors.Addbasicamount, "4500");
}

@When("user click on next Exposure page")
    public void userClickNextExposurePage() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(2000);
    System.out.println("User clicks on next Exposure page");
}

@When("user add GL Experience Modifier")
    public void userAddGLExperienceModifier() {
    // TODO: Define selectors.AddGLmodifierExp in Selectors.java
    testContext.page.fill(selectors.AddGLmodifierExp, "0.5");
    testContext.page.waitForTimeout(2000);
    System.out.println("User adds GL experience modifier");
}

@When("user add Location - Inside Premises")
    public void userAddLocationInsidePremises() {
    // TODO: Define selectors.Locationinside in Selectors.java
    testContext.page.fill(selectors.Locationinside, "0.05");
    testContext.page.waitForTimeout(2000);
    System.out.println("User adds Location - Inside Premises");
}

@When("user add justification for location")
    public void userAddJustificationForLocation() {
    // TODO: Define selectors.jsutificationlocationinsider in Selectors.java
    testContext.page.fill(selectors.jsutificationlocationinsider, "test");
    testContext.page.waitForTimeout(2000);
    System.out.println("User adds justification for Location - Inside Premises");
}

@When("user add Safety Organization")
    public void userAddSafetyOrganization() {
    // TODO: Define selectors.safetyorg in Selectors.java
    testContext.page.fill(selectors.safetyorg, "0.02");
    testContext.page.waitForTimeout(2000);
    System.out.println("User adds Safety Organization");
}

@When("user add justification for safety org")
    public void userAddJustificationForSafetyOrg() {
    // TODO: Define selectors.justificationsafety in Selectors.java
    testContext.page.fill(selectors.justificationsafety, "test");
    testContext.page.waitForTimeout(2000);
    System.out.println("User adds justification for Safety Organization");
}

@When("user clicks on next on Modifier page")
    public void userClicksNextOnModifierPage() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(2000);
    System.out.println("User clicks on next Modifier page");
}

@When("user Risk Analysis add contingency")
    public void userRiskAnalysisAddContingency() {
    testContext.page.click(selectors.AddContingency);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Add Contingency");
}

@When("user add title")
    public void userAddTitle() {
    // TODO: Define selectors.AddcontigencyTitle in Selectors.java
    testContext.page.fill(selectors.AddcontigencyTitle, "test");
    testContext.page.waitForTimeout(1000);
    System.out.println("User adds title");
}

@When("user add description")
    public void userAddDescription() {
    // TODO: Define selectors.AddContigencayDesc in Selectors.java
    testContext.page.fill(selectors.AddContigencayDesc, "testing for playwright");
    testContext.page.waitForTimeout(1000);
    System.out.println("User adds description");
}

@When("user add Action")
    public void userAddAction() {
    // TODO: Define selectors.AddContigencayAction in Selectors.java
    testContext.page.click(selectors.AddContigencayAction);
    testContext.page.waitForTimeout(1000);
    testContext.page.selectOption(selectors.Action, "Change policy retroactively");
    testContext.page.waitForTimeout(1000);
    System.out.println("User adds action");
}

@When("user add duedate")
    public void userAddDueDate() {
    // TODO: Define selectors.duedateAddCont in Selectors.java
    testContext.page.fill(selectors.duedateAddCont, "06/17/2025");
    testContext.page.waitForTimeout(1000);
    System.out.println("User adds due date");
}

@When("user click on Ok on Add contingency")
    public void userClickOkOnAddContingency() {
    testContext.page.click(selectors.Ok);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks OK");
}

@When("user add click on next on Risk Analysis")
    public void userClickNextOnRiskAnalysis() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(2000);
    System.out.println("User clicks next on Risk Analysis");
}

@When("user click on Close Options for general")
    public void userClickCloseOptionsForGeneral() {
    testContext.page.click(selectors.Closeoption);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks Close Options");
}

@When("user clicks on withdraw for general")
    public void userClicksWithdrawForGeneral() {
    testContext.page.click(selectors.Withdraw);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks Withdraw");
}


}
