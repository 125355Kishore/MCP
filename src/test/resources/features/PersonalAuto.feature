@runThis
Feature:PersonalAuto
 
Background:
Given user navigates to the URL
When user enters username
When user enters password
When user clicks on login
When user clicks on account
When user can click on New Submission
 
Scenario: PersonalAutoPolicy
When user select PersonalAuto
When user clicks on offering selection dropdown and chooses Basic program
When user clicks on next10
 
 
When user chooses Yes for the Is the applicant currently insured query
When user chooses Yes for the Is the applicant license currently suspended ,cancelled or revoked
When user chooses Yes for the Has the applicant license ever been cancelled,suspended or revoked
When user chooses Yes for the Any drivers with convictions for moving traffice violations within the past three years
When user fills the text inside the please provide the driver name and explain the conviction
When user chooses Yes Has any policy or coverage been declined ,cancelled or non renewed during the prior three days
When user clicks on next11
 
 
# When user enters date in the date quote needed field
When user clicks on next 12
When user clicks on columns
When user clicks on next13
When user clicks on columns 2
When user clicks on next14
When user clicks on columns 3
When user clicks on next15
 
When user clicks on the coverages1 in dropdown
 
When user chooses the value from auto liabilty package dropdown
When user chooses the value from the medical payments package dropdown
# When user chooses Uninsured motorist bodily injured dropdown
 
When user clicks on Uninsured motorist property damage checkbox
When user clicks on next16
 
When user chooses the value from View issue blocking dropdown
When user clicks on close options dropdown

