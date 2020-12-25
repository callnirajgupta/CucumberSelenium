$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefile/Module2/AddToCart.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout related scenarios like add to cart,remove,payment etc.",
  "description": "",
  "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout_Scenarios"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Add a single item into cart and then remove it",
  "description": "",
  "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.;add-a-single-item-into-cart-and-then-remove-it",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@AddToCart"
    },
    {
      "line": 4,
      "name": "@getexamplecount"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User \"\u003cUser\u003e\" with password \"\u003cPassword\u003e\" login into the application with correct credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user searches for the \"\u003cItem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Add To Cart and Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "summary section shows the added item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user delete the item with sku as \"\u003cSKU\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "added item should be removed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify that User successfully log out of the application",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.;add-a-single-item-into-cart-and-then-remove-it;",
  "rows": [
    {
      "cells": [
        "User",
        "Password",
        "Item",
        "SKU"
      ],
      "line": 16,
      "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.;add-a-single-item-into-cart-and-then-remove-it;;1"
    },
    {
      "cells": [
        "callnirajgupta@gmail.com",
        "password1",
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1"
      ],
      "line": 17,
      "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.;add-a-single-item-into-cart-and-then-remove-it;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2835039600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Add a single item into cart and then remove it",
  "description": "",
  "id": "checkout-related-scenarios-like-add-to-cart,remove,payment-etc.;add-a-single-item-into-cart-and-then-remove-it;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@AddToCart"
    },
    {
      "line": 1,
      "name": "@Checkout_Scenarios"
    },
    {
      "line": 4,
      "name": "@getexamplecount"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user searches for the \"Faded Short Sleeve T-shirts\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Add To Cart and Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "summary section shows the added item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user delete the item with sku as \"SKU : demo_1\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "added item should be removed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify that User successfully log out of the application",
  "keyword": "And "
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
  "location": "GlobalStepDefinition.user_with_password_login_into_the_application(String,String)"
});
formatter.result({
  "duration": 31251260100,
  "error_message": "java.lang.NullPointerException\r\n\tat com.automation.util.SeleniumUtil.maximizeBrowser(SeleniumUtil.java:188)\r\n\tat com.automation.util.CommonUtil.login(CommonUtil.java:49)\r\n\tat com.automation.common.GlobalStepDefinition.user_with_password_login_into_the_application(GlobalStepDefinition.java:124)\r\n\tat ✽.Given User \"callnirajgupta@gmail.com\" with password \"password1\" login into the application with correct credentials(src/test/resources/featurefile/Module2/AddToCart.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 23
    }
  ],
  "location": "AddToCart.user_searches_for_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCart.verify_item_is_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCart.summary_section_shows_the_added_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SKU : demo_1",
      "offset": 34
    }
  ],
  "location": "AddToCart.user_clicks_on_delete(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToCart.Then_added_item_should_be_removed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_successfully_log_out_of_the_application_after_clicking_on_log_out_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 36171734700,
  "error_message": "java.lang.NullPointerException\r\n\tat com.automation.common.GlobalStepDefinition.TearDown(GlobalStepDefinition.java:168)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:81)\r\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:69)\r\n\tat org.testng.TestRunner$1.run(TestRunner.java:697)\r\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:1004)\r\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:728)\r\n\tat org.testng.TestRunner.run(TestRunner.java:629)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.run(TestNG.java:1064)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:132)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:134)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:145)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:109)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.uri("src/test/resources/featurefile/Module2/Login.feature");
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
  "duration": 378282400,
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
