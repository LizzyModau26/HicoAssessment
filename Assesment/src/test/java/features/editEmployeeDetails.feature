@editEmployeeDetails
Feature: Edit Employee Details functionality

  Scenario Outline:
    Given User opens the main website page
    Then User selects a employee and enters firstname "<firstname>" and surname "<surname>" and employeeNumber "<employeeNumber>" and salary "<salary>" and saves.


    Examples:
      | firstname  | surname | employeeNumber | salary  |
      | Mary-Ann   | Jones   | 1220           | 20000   |