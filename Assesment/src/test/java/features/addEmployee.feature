@addEmployee
Feature: Add Employee functionality

  Scenario Outline:
                  Given User is on the the main website page
                  Then User enters firstname "<firstname>" and surname "<surname>" and employeeNumber "<employeeNumber>" and salary "<salary>" login


    Examples:
      | firstname  | surname | employeeNumber | salary |
      | Lizzy      | Modau   | 120            | 2000   |