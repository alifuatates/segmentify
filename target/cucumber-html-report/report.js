$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/segmentify/web/qa/features/amazoncom.feature");
formatter.feature({
  "name": "Control of login and product search screens",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to amazon.com.tr homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.iNavigateToHepsiburadaHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check success login and then success logout case",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@done"
    },
    {
      "name": "@login"
    },
    {
      "name": "@logout"
    }
  ]
});
formatter.step({
  "name": "user login system",
  "keyword": "When "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.userLoginSystem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page must have \"Hesabım\" content",
  "keyword": "Then "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.thePageMustHaveContent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logout system",
  "keyword": "And "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.userLogoutSystem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page must have \"Giriş yap\" content",
  "keyword": "Then "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.thePageMustHaveContent(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "control of the search of the products with and without results in the search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@done"
    },
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "user search product \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "confirm search result",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Televizyon"
      ]
    },
    {
      "cells": [
        "\u003d1-234093584790241o[pkej2roy4h3o1p3;kemrn.2kbho\u00271pu3o;jer2uo1y4e"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to amazon.com.tr homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.iNavigateToHepsiburadaHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "control of the search of the products with and without results in the search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@done"
    },
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "user search product \"Televizyon\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.userSearchProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirm search result",
  "keyword": "Then "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.ConfirmSearchResult()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to amazon.com.tr homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.iNavigateToHepsiburadaHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "control of the search of the products with and without results in the search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@done"
    },
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "user search product \"\u003d1-234093584790241o[pkej2roy4h3o1p3;kemrn.2kbho\u00271pu3o;jer2uo1y4e\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.userSearchProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirm search result",
  "keyword": "Then "
});
formatter.match({
  "location": "com.segmentify.web.qa.steps.BaseSteps.ConfirmSearchResult()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});