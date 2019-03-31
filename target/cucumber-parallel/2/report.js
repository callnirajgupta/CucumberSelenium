$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Video/SeleniumCumber/src/test/resources/featurefile/Module2/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Check login and register related scenarios",
  "description": "",
  "id": "check-login-and-register-related-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginandRegisterRelatedScenarios"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#@LoginAndLogout_InlineParameters @smoke @getexamplecount"
    },
    {
      "line": 5,
      "value": "#Scenario: login with InlineParameters"
    },
    {
      "line": 6,
      "value": "#Given User \"admin@p.com\" with password \"Password-11\" login into the application with correct credentials InlineParameters"
    },
    {
      "line": 7,
      "value": "#Given User successfully log out of the application after clicking on log out button"
    },
    {
      "line": 10,
      "value": "#@LoginAndLogout_ConfigFileParameters @smoke"
    },
    {
      "line": 11,
      "value": "#Scenario: login with ConfigFileParameters"
    },
    {
      "line": 12,
      "value": "#Given User \"User1\" login into the application with correct credentials ConfigFileParameterss"
    },
    {
      "line": 13,
      "value": "#Given User successfully log out of the application after clicking on log out button"
    },
    {
      "line": 16,
      "value": "#declare the parameter at class level so that it be used by other methods in that class..like did for item in addtocart"
    }
  ],
  "line": 18,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@LoginAndLogout_ExamplesParameters"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User \"\u003cUser\u003e\" with password \"\u003cPassword\u003e\" login into the application with correct credentials ExamplesParameters",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User successfully log out of the application after clicking on log out button",
  "keyword": "Given "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;",
  "rows": [
    {
      "cells": [
        "User",
        "Password"
      ],
      "line": 22,
      "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;1"
    },
    {
      "cells": [
        "callnirajgupta@gmail.com",
        "password1"
      ],
      "line": 23,
      "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1296919313,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@LoginAndLogout_ExamplesParameters"
    },
    {
      "line": 1,
      "name": "@LoginandRegisterRelatedScenarios"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials ExamplesParameters",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User successfully log out of the application after clicking on log out button",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "callnirajgupta@gmail.com",
      "offset": 6
    },
    {
      "val": "password1",
      "offset": 47
    }
  ],
  "location": "Login.user_with_password_login_into_the_application_with_correct_credentials_ExamplesParameters(String,String)"
});
formatter.result({
  "duration": 257608142204,
  "status": "passed"
});
formatter.match({
  "location": "GlobalStepDefinition.user_successfully_log_out_of_the_application_after_clicking_on_log_out_button()"
});
formatter.result({
  "duration": 2129678279,
  "status": "passed"
});
formatter.write("hello");
formatter.after({
  "duration": 116331339,
  "status": "passed"
});
});