Feature: Automated to view how many Approved request in 2019.

Scenario Outline: Successful Login with Admin credentials
	Given Admin is on Login Page
	When he enters "<email>" and "<password>"
	And he clicks on Login button
	Then he navigates to Content Page
	Examples:
	|  email			| password |
	|	admin@test.com 	| test123 |

Scenario Outline: Admin can see how many Request with Approved status and in the year of 2019
	When Admin enters Content page
	Then he can see how many Request with Approved status and in the year of "<expectedyear>" in table 
	Examples:
	|  expectedyear	|
	|	2019 	|