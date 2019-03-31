$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Video/SeleniumCumber/src/test/resources/featurefile/Module2/AddToCart.feature");
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
        "admin@p.com",
        "Password-11",
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
  "duration": 1328585170,
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
  "name": "User \"admin@p.com\" with password \"Password-11\" login into the application with correct credentials",
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
      "val": "admin@p.com",
      "offset": 6
    },
    {
      "val": "Password-11",
      "offset": 34
    }
  ],
  "location": "GlobalStepDefinition.user_with_password_login_into_the_application(String,String)"
});
formatter.result({
  "duration": 78871153339,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.cssSelector: a.logout (tried for 10 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat com.automation.util.SeleniumUtil.ValidateWebElementPresence(SeleniumUtil.java:343)\r\n\tat com.automation.common.GlobalStepDefinition.user_with_password_login_into_the_application(GlobalStepDefinition.java:113)\r\n\tat ✽.Given User \"admin@p.com\" with password \"Password-11\" login into the application with correct credentials(E:/Video/SeleniumCumber/src/test/resources/featurefile/Module2/AddToCart.feature:6)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.cssSelector: a.logout\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SAI-PC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:882)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:881)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:182)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:179)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat com.automation.util.SeleniumUtil.ValidateWebElementPresence(SeleniumUtil.java:343)\r\n\tat com.automation.common.GlobalStepDefinition.user_with_password_login_into_the_application(GlobalStepDefinition.java:113)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:81)\r\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:69)\r\n\tat org.testng.TestRunner$1.run(TestRunner.java:697)\r\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:1004)\r\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:728)\r\n\tat org.testng.TestRunner.run(TestRunner.java:629)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.run(TestNG.java:1064)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:132)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:134)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:145)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:109)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
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
formatter.embedding("image/png", "embedded0.png");
formatter.write("hello");
formatter.after({
  "duration": 2825111751,
  "status": "passed"
});
});