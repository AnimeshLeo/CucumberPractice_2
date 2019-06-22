$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/saptadeepa pc/workspace/PracticeCucumber/src/main/java/com/qa/feature/Test.feature");
formatter.feature({
  "line": 1,
  "name": "Practice Test on the demo site of Mercury travels",
  "description": "",
  "id": "practice-test-on-the-demo-site-of-mercury-travels",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mercury travels page test",
  "description": "",
  "id": "practice-test-on-the-demo-site-of-mercury-travels;mercury-travels-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user moves to registration page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user register by filling the details and submit",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "phone",
        "email",
        "address",
        "city",
        "state",
        "postalCode",
        "country",
        "username",
        "password",
        "confirm_password"
      ],
      "line": 8
    },
    {
      "cells": [
        "Ani",
        "Saha",
        "900400",
        "saha@xmail.com",
        "kolkata,rajarhat",
        "kolkata",
        "West Bengal",
        "126",
        "INDIA",
        "a",
        "t",
        "t"
      ],
      "line": 9
    },
    {
      "cells": [
        "Saptu",
        "Gorai",
        "800600",
        "saptu@xmail.com",
        "shapoorji,newtown",
        "kolkata",
        "West Bengal",
        "191",
        "INDIA",
        "s",
        "t",
        "t"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the user types username and password after registration and clicks on login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13
    },
    {
      "cells": [
        "x",
        "x"
      ],
      "line": 14
    },
    {
      "cells": [
        "a",
        "a"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user types again username and password to get to the homepage",
  "rows": [
    {
      "cells": [
        "username",
        "x"
      ],
      "line": 18
    },
    {
      "cells": [
        "password",
        "x"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the user tries to books a flight",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Fills the customer details on the passenger details page and clicks on submit",
  "rows": [
    {
      "cells": [
        "firstpassengerfname",
        "Ani"
      ],
      "line": 22
    },
    {
      "cells": [
        "firstpassengerlname",
        "Saha"
      ],
      "line": 23
    },
    {
      "cells": [
        "secondpassengerfname",
        "Saptu"
      ],
      "line": 24
    },
    {
      "cells": [
        "secondpassengerlname",
        "Gorai"
      ],
      "line": 25
    },
    {
      "cells": [
        "ccfirstname",
        "Ani"
      ],
      "line": 26
    },
    {
      "cells": [
        "cclastname",
        "King"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "the flight is booked successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_1.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 10372724131,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_user_moves_to_registration_page()"
});
formatter.result({
  "duration": 8496778490,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_user_register_by_filling_the_details(DataTable)"
});
formatter.result({
  "duration": 58109466905,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_user_types_username_and_password_after_registration_and_clicks_on_login(DataTable)"
});
formatter.result({
  "duration": 45696612454,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_user_is_on_the_homepage(DataTable)"
});
formatter.result({
  "duration": 24986964004,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_user_tries_to_books_a_flight()"
});
formatter.result({
  "duration": 1872329568,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.fills_the_customer_details_on_the_passenger_details_page_and_clicks_on_submit(DataTable)"
});
formatter.result({
  "duration": 2576946761,
  "status": "passed"
});
formatter.match({
  "location": "StepDef_1.the_flight_is_booked_successfully()"
});
formatter.result({
  "duration": 179959813,
  "status": "passed"
});
});