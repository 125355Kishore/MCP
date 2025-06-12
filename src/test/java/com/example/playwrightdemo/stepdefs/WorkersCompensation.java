package com.example.playwrightdemo.stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.playwrightdemo.selectors.Selectors;



public class WorkersCompensation {
    // Example: Replace with your actual application URL
    private static final String BASE_URL = "https://pc-sandbox-gwcpdev.hexaware.zeta1-andromeda.guidewire.net/PolicyCenter.do";
    private final Selectors selectors = new Selectors();
    private final TestContext testContext;

    public WorkersCompensation(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("user navigates to the URL for workers compensation")
    public void userNavigatesToURLForWorkersComp() {
        testContext.page.navigate(BASE_URL);
        testContext.page.waitForTimeout(2000);
        System.out.println("Navigated to Workers Compensation URL");
    }

    @When("user enters username for workers compensation")
    public void userEntersUsernameForWorkersComp() {
        testContext.page.fill(selectors.username, "su");
        testContext.page.waitForTimeout(2000);
        System.out.println("User entered username for workers compensation");
    }

    @When("user enters password for workers compensation")
    public void userEntersPasswordForWorkersComp() {
        testContext.page.fill(selectors.password, "gw");
        testContext.page.waitForTimeout(2000);
        System.out.println("Entered the password");
    }


    @When("user clicks on login for workers compensation")
    public void userClicksOnLoginForWorkersComp() {
        testContext.page.click(selectors.login);
        testContext.page.waitForTimeout(2000);
        System.out.println("User is logged in for workers compensation");
    }

    @When("user clicks on account and select the account")
    public void userClicksOnAccount() {
        testContext.page.click(selectors.Accountab);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicked on Account");
    }

    @When("user can click on New Submission for workers compensation")
    public void userClicksNewSubmissionForWorkersComp() {
        testContext.page.click(selectors.NewSubmission);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicked new submission");
    }

    @When("user select Workers Compensation")
    public void userSelectsWorkersComp() {
        testContext.page.click(selectors.Workerscompselect);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicks on Workers Compensation");
    }

    @When("user enters Qualification answers")
    public void userEntersQualificationAnswers() {
        testContext.page.click(selectors.Qustion1);
        testContext.page.click(selectors.Question3);
        testContext.page.fill(selectors.Totalanaulamount, "5000");
        testContext.page.waitForTimeout(2000);
        System.out.println("User enters answers in Qualification page");
    }

@When("user click next")

    public void userClicksNext() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicks Next on Qualification page");
    }

@When("user enters Estimated value and mandatory values")

    public void userEntersEstimatedValue() {
        testContext.page.fill(selectors.Estprimenm, "45000");
        System.out.println("User enters all mandatory value in Policy info");
    }

@When("user enters Datequote")

    public void userEntersDateQuote() {
        testContext.page.fill(selectors.Datequote, "06/17/2025");
        testContext.page.waitForTimeout(1000);
        System.out.println("User enters Datequote");
    }

@When("user enters Offical ID")

    public void userEntersOfficialID() {
        testContext.page.fill(selectors.Industrialcode, " ");
        testContext.page.fill(selectors.Industrialcode, "1541");
        testContext.page.click(selectors.deleteSSNdropdown);
        testContext.page.click(selectors.deleteSSN);
        testContext.page.fill(selectors.SSN, "465-45-4765");
        testContext.page.waitForTimeout(2000);
        System.out.println("User enters Official ID");
    }

@When("user click on PolicyInfo next")

    public void userClicksPolicyInfoNext() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(2000);
        System.out.println("User clicks Next on Policy Info page");
    }

@When("user navigates to Location and click on Next")
    public void userNavigatesToLocationNext() {
        testContext.page.click(selectors.NextQuali);
        testContext.page.waitForTimeout(2000);
    System.out.println("User clicks Next on Location page");
}

@When("user naviagtes to WC Coverage And click on Add Class")
public void userNavigatesToWCCoverage() {
    testContext.page.click(selectors.WCcovAddClass);
    testContext.page.waitForTimeout(2000);
    System.out.println("User clicks Add Class on WC Coverage page");
}

@When("User selection Location")
public void userSelectsLocation() {
    testContext.page.click(selectors.WClocation);
    testContext.page.selectOption(selectors.WClocation, "1: 2850 S. Delaware St., San Mateo, CA");
    testContext.page.waitForTimeout(2000);
    testContext.page.keyboard().press("Tab");
    System.out.println("User selects location");
}

@When("user enter Class code")
public void userEntersClassCode() {
    testContext.page.click(selectors.classSearchclick);
    testContext.page.fill(selectors.Classnamesearhtext, "2812");
    testContext.page.waitForTimeout(1000);
    testContext.page.click(selectors.ClassnameSearch);
    testContext.page.click(selectors.Classnameselect);
    testContext.page.waitForTimeout(1000);
    testContext.page.keyboard().press("Tab");
    System.out.println("User enters class code");
}

@When("user enter employee description")
public void userEntersEmployeeDescription() {
    testContext.page.fill(selectors.employee, "6789");
    testContext.page.waitForTimeout(1000);
    testContext.page.keyboard().press("Tab");
    testContext.page.keyboard().press("Tab");
    System.out.println("User enters employee description");
}

@When("user enters basic amount")
public void userEntersBasicAmount() {
    testContext.page.fill(selectors.basicamount, "34232");
    testContext.page.waitForTimeout(7000);
    System.out.println("User enters basic amount");
}

@When("user clicks on Next on WC Coverage")
public void userClicksNextOnWCCoverage() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks Next on WC Coverage");
}

@When("user get question count and answer")
public void userAnswersSupplementalQuestions() {
    testContext.page.click(selectors.Supplementalclick);
    for (int i = 0; i < 18; i++) {
        testContext.page.keyboard().press("Tab");
        testContext.page.keyboard().press("Space");
        testContext.page.waitForTimeout(1000);
    }
    System.out.println("User enters answers for all questions");
}

@When("user clicks on next on suppliemental")
public void userClicksNextOnSupplemental() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks Next on Supplemental");
}

@When("user click on Add Option")
public void userClicksAddOption() {
    testContext.page.click(selectors.Addoption);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Add Option");
}
@When("user clicks on Federal Liability")
public void userClicksOnFederalLiability() {
    testContext.page.click(selectors.FederalLiab);
    testContext.page.waitForTimeout(1000);
    testContext.page.click(selectors.AddFederalClass);
    System.out.println("User clicks on Federal Liability");
}

@When("user enters value for Federal Liability Classes")
public void userEntersFederalLiabilityClasses() {
    testContext.page.click(selectors.locationFederal);
    System.out.println("User enters value on Federal Liability class");
}

@When("user enters value for Federal Liability Address")
public void userEntersFederalLiabilityAddress() {
    testContext.page.selectOption(selectors.locationFederal, "1: 2850 S. Delaware St., San Mateo, CA");
    testContext.page.waitForTimeout(2000);
    testContext.page.keyboard().press("Tab");
    System.out.println("User enters value on Federal Liability class");
}

@When("user enters value in Class code")
public void userEntersFederalClassCode() {
    testContext.page.click(selectors.ClasscodeFeb);
    testContext.page.fill(selectors.ClassCodeSearchTextbox, "7016");
    testContext.page.click(selectors.ClassCodeSearchClick);
    testContext.page.waitForTimeout(500);
    testContext.page.click(selectors.ClassCodeSelect);
    testContext.page.waitForTimeout(2000);
    testContext.page.keyboard().press("Tab");
    testContext.page.keyboard().press("Tab");
    System.out.println("User enters value on Federal Liability class code");
}

@When("user enters Federal basic amount")
public void userEntersFederalBasicAmount() {
    testContext.page.keyboard().press("Tab");
    testContext.page.fill(selectors.BasicFrdamount, "6789");
    testContext.page.waitForTimeout(2000);
    System.out.println("User enters value on Federal Liability basic amount");
}

@When("user clicks on next on WC Options")
public void userClicksNextOnWCOptions() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Next");
}

@When("user add contingency")
public void userAddsContingency() {
    testContext.page.click(selectors.AddContingency);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Add Contingency");
}

@When("user add details to contingency")
public void userAddsContingencyDetails() {
    testContext.page.fill(selectors.title, "federal class");
    testContext.page.fill(selectors.description, "testing of playwright cucumber typescript");
    System.out.println("User adds details to contingency");
}

@When("user add details to Action")
public void userAddsContingencyAction() {
    testContext.page.click(selectors.Select);
    testContext.page.selectOption(selectors.Select, "Change policy for remainder of term");
}

@When("user add details to Duedate")
public void userAddsContingencyDueDate() {
    testContext.page.click(selectors.Duedate);
    testContext.page.fill(selectors.Duedate, "07/15/2025");
    testContext.page.click(selectors.Ok);
    testContext.page.waitForTimeout(1000);
    System.out.println("User adds due date to contingency");
}

@When("user clicks on next contingency")
public void userClicksNextContingency() {
    testContext.page.click(selectors.NextQuali);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Next");
}

@When("user click on Close Options")
public void userClicksCloseOptions() {
    testContext.page.click(selectors.Closeoption);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Close Options");
}

@When("user clicks on withdraw")
public void userClicksWithdraw() {
    testContext.page.click(selectors.Withdraw);
    testContext.page.waitForTimeout(1000);
    System.out.println("User clicks on Withdraw");
}


}
