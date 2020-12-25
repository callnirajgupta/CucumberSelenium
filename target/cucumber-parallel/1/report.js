$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Video/CucumberSelenium/src/test/resources/featurefile/Module2/Login.feature");
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
  "line": 6,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@LoginAndLogout_ExamplesParameters"
    },
    {
      "line": 5,
      "name": "@niraj"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User \"\u003cUser\u003e\" with password \"\u003cPassword\u003e\" login into the application with correct credentials ExamplesParameters",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User successfully log out of the application after clicking on log out button",
  "keyword": "Given "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;",
  "rows": [
    {
      "cells": [
        "User",
        "Password"
      ],
      "line": 10,
      "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;1"
    },
    {
      "cells": [
        "callnirajgupta@gmail.com",
        "password1"
      ],
      "line": 11,
      "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 939190200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "login with ExamplesParameters",
  "description": "",
  "id": "check-login-and-register-related-scenarios;login-with-examplesparameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@LoginAndLogout_ExamplesParameters"
    },
    {
      "line": 5,
      "name": "@niraj"
    },
    {
      "line": 1,
      "name": "@LoginandRegisterRelatedScenarios"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials ExamplesParameters",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
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
  "duration": 7446361700,
  "error_message": "java.lang.NullPointerException: null value in entry: url\u003dnull\r\n\tat com.google.common.collect.CollectPreconditions.checkEntryNotNull(CollectPreconditions.java:34)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.\u003cinit\u003e(SingletonImmutableBiMap.java:42)\r\n\tat com.google.common.collect.ImmutableBiMap.of(ImmutableBiMap.java:73)\r\n\tat com.google.common.collect.ImmutableMap.of(ImmutableMap.java:123)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:325)\r\n\tat com.automation.util.SeleniumUtil.launchApplication(SeleniumUtil.java:193)\r\n\tat com.automation.util.CommonUtil.login(CommonUtil.java:53)\r\n\tat com.automation.module1.Login.user_with_password_login_into_the_application_with_correct_credentials_ExamplesParameters(Login.java:83)\r\n\tat ✽.Given User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials ExamplesParameters(E:/Video/CucumberSelenium/src/test/resources/featurefile/Module2/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GlobalStepDefinition.user_successfully_log_out_of_the_application_after_clicking_on_log_out_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("hello");
formatter.after({
  "duration": 550991600,
  "status": "passed"
});
});