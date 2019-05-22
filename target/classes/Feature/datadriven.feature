Feature: facebook page registration
Scenario Outline: user registration on facebook
Given user is on login page
When user enters <"firstname"> and <"lastname"> and <"mobileNo">
Then user close the browser
Examples:
      |"firstname" | "lastname"| "mobileno"   |
      | "mamta"    |  "ritesh" | "9890986713" |
      | "akash"    |  "love"   | "9890986"    |
      | "sky"      |  "valvour"| "989098"     |