$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/editEmployeeDetails.feature");
formatter.feature({
  "line": 2,
  "name": "Edit Employee Details functionality",
  "description": "",
  "id": "edit-employee-details-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@editEmployeeDetails"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "edit-employee-details-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens the main website page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects a employee and enters firstname \"\u003cfirstname\u003e\" and surname \"\u003csurname\u003e\" and employeeNumber \"\u003cemployeeNumber\u003e\" and salary \"\u003csalary\u003e\" and saves.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "edit-employee-details-functionality;;",
  "rows": [
    {
      "cells": [
        "firstname",
        "surname",
        "employeeNumber",
        "salary"
      ],
      "line": 10,
      "id": "edit-employee-details-functionality;;;1"
    },
    {
      "cells": [
        "Mary-Ann",
        "Jones",
        "1220",
        "20000"
      ],
      "line": 11,
      "id": "edit-employee-details-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2583761800,
  "status": "passed"
});
formatter.before({
  "duration": 1746800,
  "status": "passed"
});
formatter.before({
  "duration": 4540100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "edit-employee-details-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@editEmployeeDetails"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens the main website page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User selects a employee and enters firstname \"Mary-Ann\" and surname \"Jones\" and employeeNumber \"1220\" and salary \"20000\" and saves.",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "editEmployeeDetailsStep.User_opens_the_main_website_page()"
});
formatter.result({
  "duration": 3151349200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mary-Ann",
      "offset": 46
    },
    {
      "val": "Jones",
      "offset": 69
    },
    {
      "val": "1220",
      "offset": 96
    },
    {
      "val": "20000",
      "offset": 114
    }
  ],
  "location": "editEmployeeDetailsStep.userEntersEmployeeDetailsAndClicksSave(String,String,String,String)"
});
formatter.result({
  "duration": 15707471700,
  "status": "passed"
});
formatter.after({
  "duration": 654509700,
  "status": "passed"
});
formatter.after({
  "duration": 933000,
  "status": "passed"
});
formatter.after({
  "duration": 54200,
  "status": "passed"
});
});