$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/GetTheApprovedRequestIn2019.feature");
formatter.feature({
  "name": "Automated to view how many Approved request in 2019.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful Login with Admin credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Admin is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "he enters \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "he clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "he navigates to Content Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@test.com",
        "test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful Login with Admin credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Admin is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.admin_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he enters \"admin@test.com\" and \"test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.he_enters_email_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.he_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he navigates to Content Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.he_navigates_to_content_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Admin can see how many Request with Approved status and in the year of 2019",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Admin enters Content page",
  "keyword": "When "
});
formatter.step({
  "name": "he can see how many Request with Approved status and in the year of \"\u003cexpectedyear\u003e\" in table",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "expectedyear"
      ]
    },
    {
      "cells": [
        "2019"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Admin can see how many Request with Approved status and in the year of 2019",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Admin enters Content page",
  "keyword": "When "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.admin_enter_content_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he can see how many Request with Approved status and in the year of \"2019\" in table",
  "keyword": "Then "
});
formatter.match({
  "location": "Karros_StepTestWithPageObject.he_can_see_approved_request_in_2019(int)"
});
formatter.result({
  "status": "passed"
});
});