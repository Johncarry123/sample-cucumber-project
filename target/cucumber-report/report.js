$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "Nop commerce Demo Login feature",
  "description": "As a user I want to login into nope commerce website",
  "id": "nop-commerce-demo-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13850156800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should login successfully",
  "description": "",
  "id": "nop-commerce-demo-login-feature;user-should-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter email address \"abc123@gmail.com\" into eamil field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"abc123\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should successfully login to my account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 249821400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1241824000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@gmail.com",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iEnterEmailAddressIntoEamilField(String)"
});
formatter.result({
  "duration": 115733100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPasswordIntoPasswordField(String)"
});
formatter.result({
  "duration": 109460000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 155821300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSuccessfullyLoginToMyAccount()"
});
formatter.result({
  "duration": 60000,
  "status": "passed"
});
formatter.after({
  "duration": 1120140400,
  "status": "passed"
});
});