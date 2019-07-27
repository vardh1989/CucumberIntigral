$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sampletesting.feature");
formatter.feature({
  "line": 1,
  "name": "Verify sample tests for home and login screen",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1809619707,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Jawwytv site \"http://www.jawwy.tv\" opens successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User changes language in welcome screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User clicks on seven days free subscribe now button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.jawwy.tv",
      "offset": 14
    }
  ],
  "location": "SampleTestingStepDefs.jawwytv_site_something_opens_successfully(String)"
});
formatter.result({
  "duration": 33214505655,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_changes_language_in_welcome_screen()"
});
formatter.result({
  "duration": 7700695251,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_clicks_on_seven_days_free_subscribe_now_button()"
});
formatter.result({
  "duration": 8469432889,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate back button on payment screen on entering username and password",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-back-button-on-payment-screen-on-entering-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@toptest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"testuser@gm.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"12345678\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see back button displayed on payment screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testuser@gm.com",
      "offset": 25
    }
  ],
  "location": "SampleTestingStepDefs.user_enters_username_as(String)"
});
formatter.result({
  "duration": 146050418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 25
    }
  ],
  "location": "SampleTestingStepDefs.user_enters_password_as(String)"
});
formatter.result({
  "duration": 86356883,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_clicks_on_continue_button()"
});
formatter.result({
  "duration": 5063875204,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_should_see_back_button_displayed_on_payment_screen()"
});
formatter.result({
  "duration": 5040449008,
  "status": "passed"
});
formatter.after({
  "duration": 167615901,
  "status": "passed"
});
formatter.before({
  "duration": 1071600598,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Jawwytv site \"http://www.jawwy.tv\" opens successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User changes language in welcome screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User clicks on seven days free subscribe now button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.jawwy.tv",
      "offset": 14
    }
  ],
  "location": "SampleTestingStepDefs.jawwytv_site_something_opens_successfully(String)"
});
formatter.result({
  "duration": 7349427361,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_changes_language_in_welcome_screen()"
});
formatter.result({
  "duration": 6903886038,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_clicks_on_seven_days_free_subscribe_now_button()"
});
formatter.result({
  "duration": 7513224908,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Validate terms and conditions page",
  "description": "",
  "id": "verify-sample-tests-for-home-and-login-screen;validate-terms-and-conditions-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@toptest"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User clicks on Terms and Conditions link in create your account section",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User should see that Terms \u0026 Conditions section is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleTestingStepDefs.user_clicks_on_terms_and_conditions_link_in_create_your_account_section()"
});
formatter.result({
  "duration": 5141138879,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestingStepDefs.user_should_see_that_terms_conditions_section_is_displayed()"
});
formatter.result({
  "duration": 5041905242,
  "status": "passed"
});
formatter.after({
  "duration": 163211119,
  "status": "passed"
});
});