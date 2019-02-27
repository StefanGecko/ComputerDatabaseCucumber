@feature_delete
Feature: Delete computer test cases

  @RegressionTest
  Scenario Outline: TC: 15 - Validate if computer can be removed from the computer database
    And access <computerName> that will be removed
    Then validate that computer has been deleted successfully

    Examples:
      |computerName|
      |Dell Inspiron 15|
      |Lenovo X1 ThinkPad Carbon|