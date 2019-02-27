@feature_filter
Feature: Filter computer test cases

  @RegressionTest
  Scenario Outline: TC: 18 - Validate if filtering is done by ComputerName
    And validate that filtering is done by <computerName>

    Examples:
    |computerName|
    |Lenovo X1 ThinkPad Carbon 3rd Generation|