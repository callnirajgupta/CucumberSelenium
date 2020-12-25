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
  "duration": 2827795400,
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
  "duration": 39568345500,
  "status": "passed"
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
  "duration": 173100,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.verify_item_is_present()"
});
formatter.result({
  "duration": 20800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.summary_section_shows_the_added_item()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
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
  "duration": 66400,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.Then_added_item_should_be_removed()"
});
formatter.result({
  "duration": 32800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_successfully_log_out_of_the_application_after_clicking_on_log_out_button()"
});
formatter.result({
  "duration": 134200,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("hello");
formatter.after({
  "duration": 759988500,
  "status": "passed"
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
  "duration": 287782800,
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
formatter.result({
  "duration": 29861047800,
  "status": "passed"
});
formatter.match({
  "location": "GlobalStepDefinition.user_successfully_log_out_of_the_application_after_clicking_on_log_out_button()"
});
formatter.result({
  "duration": 2942158600,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.write("hello");
formatter.after({
  "duration": 2122132100,
  "status": "passed"
});
});