package com.example.playwrightdemo.selectors;

public class Selectors {
    // --- GeneralLiability missing selectors: Add correct XPath/CSS as needed ---
    // Example: Replace with the actual selector for the Additional Coverages button or link
    // public static final String AdditionalCoverages = "//div[@aria-controls='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-GeneralLiability_AdditionalCoveragesCard']";
    // public static final String AddCoverage = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-AdditionalCoveragesPanelSet-AdditionalCoveragesDV_tb-Add']";
    // public static final String SelectCat = "//select[@name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']";
    // public static final String SearchGL = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    // public static final String EmploymentCoverage = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox']";
    // public static final String AddSelecedCoverages = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton']";
    // public static final String Addexposure = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV_tb-Add']";
    // public static final String Addlocation = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location']";
    // public static final String ExposureClassCodeSearch = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode-SelectClassCode']";
    // public static final String Addclass = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode']";
    // public static final String Addbasicamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-BasisAmount']";
    // public static final String AddGLmodifierExp = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput']";
    // public static final String Locationinside = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-CreditDebit']";
    // public static final String jsutificationlocationinsider = "//TODO: Add correct selector for jsutificationlocationinsider";
    // public static final String safetyorg = "//TODO: Add correct selector for safetyorg";
    // public static final String justificationsafety = "//TODO: Add correct selector for justificationsafety";
    // public static final String AddcontigencyTitle = "//TODO: Add correct selector for AddcontigencyTitle";
    // public static final String AddContigencayDesc = "//TODO: Add correct selector for AddContigencayDesc";
    // public static final String AddContigencayAction = "//TODO: Add correct selector for AddContigencayAction";
    // public static final String Action = "//TODO: Add correct selector for Action";
    // public static final String duedateAddCont = "//TODO: Add correct selector for duedateAddCont";



    /////////////////////////////////////////////////////
    /// 
     public static final String Workerscompselect = "//td[@id ='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-6-Select']";
    public static final String Qustion1 = "(//div[@class='gw-radioDiv'])[1]";
    public static final String Question3 = "(//div[@class='gw-radioDiv'])[3]";
    public static final String Totalanaulamount = "//input[@name='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-IntegerFieldInput_NoPost']";
    public static final String NextQuali = "//div[@id='SubmissionWizard-Next']";
    public static final String Datequote = "//input[@class='gw-min-visible gw-DateValueWidget--dateInput']";
    public static final String Estprimenm = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-estimatedPremiumInput']";
    public static final String SSN = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyOfficialIDInputSet-OfficialIDDV_Input']";
    public static final String Industrialcode = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-IndustryCode']";
    public static final String deleteSSNdropdown = "//div[@class='gw-PrivacyValueWidget--dropMenu gw-isTopLevelMenu gw-hasChildren gw-putSubMenusBelow gw-action--outer']";
    public static final String deleteSSN = "(//div[@data-gw-click='gwPrivacy.clearValue id:SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyOfficialIDInputSet-OfficialIDDV_Input'])[1]";
    public static final String WCcovAddClass = "//div[@class='gw-AddButtonWidget gw-styleTag--ToolbarWidget gw-ToolbarButtonWidget gw-putSubMenusBelow gw-isTopLevelMenu gw-hasMinimizedView gw-action--outer']";
    public static final String WClocation = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-Loc']";
    public static final String WClocationselect = "//option[@value='PolicyLocation:530']";
    public static final String classSearchclick = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-ClassCode-SelectClassCode']";
    public static final String Classnamesearhtext = "//input[@name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code']";
    public static final String ClassnameSearch = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    public static final String Classnameselect = "//td[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-1']";
    public static final String employee = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-NumEmployees']";
    public static final String basicamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-AnnualRenum']";
    public static final String Errormessage = "//div[@class='gw-message-and-suffix']";
    public static final String Supplementalclick = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_0']";
    public static final String Addoption = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']";
    public static final String FederalLiab = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton-0-CurrentOption']";
    public static final String AddFederalClass = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV_tb-Add']";
    public static final String locationFederal = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-Loc']";
    public static final String ClasscodeFeb = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode-SelectClassCode']";
    public static final String ClassCodeSearchTextbox = "//input[@name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code']";
    public static final String ClassCodeSearchClick = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    public static final String ClassCodeSelect = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select']";
    public static final String BasicFrdamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-AnnualRenum']";
    public static final String AddContingency = "//div[@id='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-AddNewContingencyButton']";
    public static final String title = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyTitle']";
    public static final String description = "//textarea[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDescription']";
    public static final String Select = "//select[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    public static final String Duedate = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDueDate']";
    public static final String Ok = "//div[@class='gw-ToolbarButtonWidget gw-styleTag--ToolbarWidget gw-putSubMenusBelow gw-isTopLevelMenu gw-hasMinimizedView gw-action--outer']";
    public static final String Closeoption = "//div[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions']";
    public static final String Withdraw = "//div[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob']";
    public static final String GeneralLiab = "//td[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-3-Select']";
    public static final String offeringSelection = "//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']";
    public static final String GLPreQualification = "//div[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_1']";
    public static final String AdditionalCoverages = "//div[@aria-controls='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-GeneralLiability_AdditionalCoveragesCard']";
    public static final String AddCoverage = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-AdditionalCoveragesPanelSet-AdditionalCoveragesDV_tb-Add']";
    public static final String SelectCat = "//select[@name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']";
    public static final String SearchGL = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    public static final String EmploymentCoverage = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox']";
    public static final String AddSelecedCoverages = "//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton']";
    public static final String Addexposure = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV_tb-Add']";
    public static final String Addlocation = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location']";
    public static final String ExposureClassCodeSearch = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode-SelectClassCode']";
    public static final String Addclass = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode']";
    public static final String Addbasicamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-BasisAmount']";
    public static final String AddGLmodifierExp = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput']";
    public static final String Locationinside = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-CreditDebit']";
    public static final String jsutificationlocationinsider = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-Justification']";
    public static final String safetyorg = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-7-CreditDebit']";
    public static final String justificationsafety = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-7-Justification']";
    public static final String AddcontigencyTitle = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyTitle']";
    public static final String AddContigencayDesc = "//textarea[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDescription']";
    public static final String AddContigencayAction = "//div[@id='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    public static final String Action = "//select[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    public static final String duedateAddCont = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDueDate']";


  
    //  AdditionalCoverages="//div[@aria-controls='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-GeneralLiability_AdditionalCoveragesCard']";
    // AddCoverage="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-AdditionalCoveragesPanelSet-AdditionalCoveragesDV_tb-Add']";
    // SelectCat="//select[@name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']";
    // SearchGL="//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    // EmploymentCoverage="//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox']";
    // AddSelecedCoverages="//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton']";
    // Addexposure ="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV_tb-Add']";
    // Addlocation= "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location']";
    // ExposureClassCodeSearch="//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode-SelectClassCode']";
    // Addclass="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode']";
    // Addbasicamount="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-BasisAmount']";
    // AddGLmodifierExp="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput']";
    // Locationinside="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-CreditDebit']";
    // jsutificationlocationinsider="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-0-Justification']";
    // safetyorg="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-7-CreditDebit']";
    // justificationsafety="//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-ScheduleRateDV-0-ScheduleRateLV-7-Justification']";
    // AddcontigencyTitle="//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyTitle']";
    // AddContigencayDesc="//textarea[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDescription']";
    // AddContigencayAction="//div[@id='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    // Action="//select[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    // duedateAddCont="//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDueD
  
  
    public final String username = "//*[@name='Login-LoginScreen-LoginDV-username']";
    public final String password = "//*[@name='Login-LoginScreen-LoginDV-password']";
    public final String login = "//*[@id='Login-LoginScreen-LoginDV-submit']";

    public final String Accountab = "//div[@id='TabBar-AccountTab']";
    public final String NewSubmission = "//*[@id='AccountFile_Summary-AccountSummaryDashboard-OpenPolicyTransactionsAccountListViewTile-NewSubmission']";
    public final String CommercialAuto = "//*[@class='gw-actionable--inner']";
    public final String selectiondropdown = "//*[@name='SubmissionWizard-OfferingScreen-OfferingSelection']";
    public final String Standardoption = "//*[@value='Special Risk']";
    public final String next = "//*[@id='SubmissionWizard-Next']";
    public final String nextbutton = "//*[text()='Next']";

    public final String organizationdropdown = "//*[@id='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-OrganizationType']";
    public final String next1 = "//*[@id='SubmissionWizard-Next']";

    public final String coveragedropdown = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BALineScreen-BALinePanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']";
    public final String productdropdown = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BALineScreen-BALinePanelSet-BALineCoveragePanelSet-BALineDV-PolicyType']";
    public final String fleetdropdown = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BALineScreen-BALinePanelSet-BALineCoveragePanelSet-BALineDV-Fleet']";
    public final String savedraft = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BALineScreen-JobWizardToolbarButtonSet-Draft']";

    public final String next2 = "//*[text()='Next']";
    public final String primarycheckbox = "//*[@class='gw-checkboxDiv--inner']";
    public final String next3 = "//*[@id='SubmissionWizard-Next']";
    public final String next4 = "//*[@id='SubmissionWizard-Next']";

    public final String togglecolumniconicon = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-jurisdictionLV_columnsMenu']";
    public final String next5 = "//*[@id='SubmissionWizard-Next']";

    public final String togglecolumnicon1 = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BADriversScreen-BADriversLV_columnsMenu']";
    public final String savedraft1 = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BADriversScreen-JobWizardToolbarButtonSet-Draft']";
    public final String next6 = "//*[@id='SubmissionWizard-Next']";

    public final String togglecolumnicon2 = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV_columnsMenu']";
    public final String next7 = "//*[@id='SubmissionWizard-Next']";
    public final String next8 = "//*[@id='SubmissionWizard-Next']";
    public final String next9 = "//*[@id='SubmissionWizard-Next']";

    public final String closeoptions = "//*[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions']";
    public final String Nottaken = "//*[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob']";
    public final String Reasoncode = "//*[@name='NotTakenReasonPopup-RejectScreen-RejectReasonDV-RejectReason']";
    public final String Reasontext = "//textarea[@name='NotTakenReasonPopup-RejectScreen-RejectReasonDV-RejectReasonText']";
    public final String Nottakenbutton = "//*[@class='gw-ToolbarButtonWidget gw-styleTag--ToolbarWidget gw-putSubMenusBelow gw-isTopLevelMenu gw-hasMinimizedView gw-action--outer']";
//////////////////////////////////////////////////////////////
///  

    
    public static final String personalauto = "//*[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-7-addSubmission']";
    public static final String offeringselectiondropdown = "//*[@name='SubmissionWizard-OfferingScreen-OfferingSelection']";
    public static final String next10 = "//*[@id='SubmissionWizard-Next']";
    public static final String applicantinsureddropdown = "//*[@name='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-ChoiceSelectInput_NoPost']";
    public static final String yes = "//*[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_0']";
    public static final String yes1 = "//*[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_0']";
    public static final String yes2 = "//*[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_0']";
    public static final String textarea = "//textarea[@name='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-StringTextAreaInput_NoPost']";
    public static final String yes3 = "//*[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost_0']";
    public static final String next11 = "//*[@id='SubmissionWizard-Next']";
    public static final String next12 = "//*[@id='SubmissionWizard-Next']";
    public static final String columns = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_columnsMenu']";
    public static final String next13 = "//*[@id='SubmissionWizard-Next']";
    public static final String columns2 = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesLV_columnsMenu']";
    public static final String next14 = "//*[@id='SubmissionWizard-Next']";
    public static final String columns3 = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesLV_columnsMenu']";
    public static final String next15 = "//*[@id='SubmissionWizard-Next']";
    public static final String coverages1 = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']";
    public static final String autoliabilitydropdown = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PersonalAuto_AllVehicleCoveragesDV-PALiabCategoryIterator-0-CoverageInputSet-CovPatternInputGroup-LiabilityTermInput']";
    public static final String MedicalLimitdropdown = "//*[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PersonalAuto_AllVehicleCoveragesDV-PALiabCategoryIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']";
    public static final String Uninsuredmotoristcheckbox = "//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PersonalAuto_AllVehicleCoveragesDV-PALiabCategoryIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']";
    public static final String next16 = "//*[@id='SubmissionWizard-Next']";
    public static final String viewissueblocking = "//*[@name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-UserViewFilter']";
    public static final String closeoptions1 = "//*[@id='SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-CloseOptions']";

////////////////////////////////////////////////////////////////////
    // public static final String Workerscompselect = "//td[@id ='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-6-Select']";
    // public static final String Qustion1 = "(//div[@class='gw-radioDiv'])[1]";
    // public static final String Question3 = "(//div[@class='gw-radioDiv'])[3]";
    // public static final String Totalanaulamount = "//input[@name='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-IntegerFieldInput_NoPost']";
    // public static final String NextQuali = "//div[@id='SubmissionWizard-Next']";
    // public static final String Datequote = "//input[@class='gw-min-visible gw-DateValueWidget--dateInput']";
    // public static final String Estprimenm = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-estimatedPremiumInput']";
    // public static final String SSN = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyOfficialIDInputSet-OfficialIDDV_Input']";
    // public static final String Industrialcode = "//input[@name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-IndustryCode']";
    // public static final String deleteSSNdropdown = "//div[@class='gw-PrivacyValueWidget--dropMenu gw-isTopLevelMenu gw-hasChildren gw-putSubMenusBelow gw-action--outer']";
    // public static final String deleteSSN = "(//div[@data-gw-click='gwPrivacy.clearValue id:SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyOfficialIDInputSet-OfficialIDDV_Input'])[1]";
    // public static final String WCcovAddClass = "//div[@class='gw-AddButtonWidget gw-styleTag--ToolbarWidget gw-ToolbarButtonWidget gw-putSubMenusBelow gw-isTopLevelMenu gw-hasMinimizedView gw-action--outer']";
    // public static final String WClocation = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-Loc']";
    // public static final String WClocationselect = "//option[@value='PolicyLocation:530']";
    // public static final String classSearchclick = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-ClassCode-SelectClassCode']";
    // public static final String Classnamesearhtext = "//input[@name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code']";
    // public static final String ClassnameSearch = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    // public static final String Classnameselect = "//td[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-1']";
    // public static final String employee = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-NumEmployees']";
    // public static final String basicamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-AnnualRenum']";
    // public static final String Errormessage = "//div[@class='gw-message-and-suffix']";
    // public static final String Supplementalclick = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_0']";
    // public static final String Addoption = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']";
    // public static final String FederalLiab = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton-0-CurrentOption']";
    // public static final String AddFederalClass = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV_tb-Add']";
    // public static final String locationFederal = "//select[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-Loc']";
    // public static final String ClasscodeFeb = "//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode-SelectClassCode']";
    // public static final String ClassCodeSearchTextbox = "//input[@name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code']";
    // public static final String ClassCodeSearchClick = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']";
    // public static final String ClassCodeSelect = "//div[@id='WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select']";
    // public static final String BasicFrdamount = "//input[@name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-AnnualRenum']";
    // public static final String AddContingency = "//div[@id='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-AddNewContingencyButton']";
    // public static final String title = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyTitle']";
    // public static final String description = "//textarea[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDescription']";
    // public static final String Select = "//select[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyAction']";
    // public static final String Duedate = "//input[@name='NewContingencyPopup-BaseContingencyInfoDV-ContingencyDueDate']";
    // public static final String Ok = "//div[@class='gw-ToolbarButtonWidget gw-styleTag--ToolbarWidget gw-putSubMenusBelow gw-isTopLevelMenu gw-hasMinimizedView gw-action--outer']";
    // public static final String Closeoption = "//div[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions']";
    // public static final String Withdraw = "//div[@id='SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob']";
    // public static final String GeneralLiab = "//td[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-3-Select']";
    // public static final String offeringSelection = "//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']";
    // public static final String GLPreQualification = "//div[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_1']";



}
