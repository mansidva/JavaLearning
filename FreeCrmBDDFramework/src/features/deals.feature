Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| naveenk | test@123 |

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
|title| amount| probability|commission|
| test deal 1| 1000 | 50 | 10 |
| test deal 2| 2000 | 40 | 20 |
| test deal 3| 3000 | 60 | 30 |

Then Close the browser