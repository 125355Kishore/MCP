
Feature: CommercialAuto

  Background:
    Given user navigates to the URL
    When user enters username
    When user enters password
    When user clicks on login
    When user clicks on account
    When user can click on New Submission
 @runThis
  Scenario: CommercialAutoPolicy
    When user select CommercialAuto
    When user clicks on the offering selection dropdown and chooses Standard Option
    When user click on next
    When user clicks on next button
    When user clicks on organization dropdown
    When user clicks on next1
    When user clicks on the coverages in dropdown
    When user clicks on the product dropdown and chooses Business Auto option
    When user clicks on the fleet dropdwon and chooses 10 or more options
    When user clicks on save draft button
    When user clicks on next2
    When user clicks on primarycheckbox
    When user clicks on next3
    When user clicks on next4
    When user clicks on the togglecolumnicon
    When user clicks on next5
    When user clicks on the togglecolumnicon1
    When user clicks on save draft1 button
    When user clicks on next6
    When user clicks on the togglecolumnicon2
    When user clicks on next7
    When user clicks on next8
    When user clicks on next9
    When user clicks on close option
    When user clicks on NotTaken option
    When user clicks on Reason code dropdwon and chooses Policy not taken option
    When user enters the reasontext
    Then user clicks on nottaken button
