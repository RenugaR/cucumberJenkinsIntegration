$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/FacebookLoginPage.feature");
formatter.feature({
  "name": "To validate Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FacebookLogin"
    },
    {
      "name": "@Regression"
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
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the Facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginSteps.user_launch_the_Facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login function with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@FacebookLogin"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@TC01"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enters the username and password in facebook page",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "Greens",
        "456789"
      ]
    },
    {
      "cells": [
        "Hello",
        "1234567"
      ]
    },
    {
      "cells": [
        "Greenstech",
        "1234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginSteps.user_enters_the_username_and_password_in_facebook_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button in facebook page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.user_clicks_the_login_button_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the login failure of facebook page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.user_validates_the_login_failure_of_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});