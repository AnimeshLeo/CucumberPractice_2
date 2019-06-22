Feature: Practice Test on the demo site of Mercury travels

Scenario: Mercury travels page test

Given User is on the login page
When the user moves to registration page
When the user register by filling the details and submit
|firstname|lastname|phone|email|address|city|state|postalCode|country|username|password|confirm_password|
|Ani|Saha|900400|saha@xmail.com|kolkata,rajarhat|kolkata|West Bengal|126|INDIA|a|t|t|
|Saptu|Gorai|800600|saptu@xmail.com|shapoorji,newtown|kolkata|West Bengal|191|INDIA|s|t|t|

And the user types username and password after registration and clicks on login
|username|password|
|x|x|
|a|a|

Then the user types again username and password to get to the homepage
|username|x|
|password|x|
When the user tries to books a flight
And Fills the customer details on the passenger details page and clicks on submit
|firstpassengerfname|Ani|
|firstpassengerlname|Saha|
|secondpassengerfname|Saptu|
|secondpassengerlname|Gorai|
|ccfirstname|Ani|
|cclastname|King|
Then the flight is booked successfully

