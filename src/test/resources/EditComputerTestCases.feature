@feature_edit
Feature: Edit computer test cases


  @RegressionTest
  Scenario Outline: TC: 10 - Validate if existing computer can be edited in the computer database
  And access the <computerName> from database
  And edit <editedComputerName> and clear date fields
  Then validate that computer name is <editedComputerName> and dates are removed

    Examples:
    |computerName|editedComputerName|
    |Lenovo X1 ThinkPad Carbon|Lenovo X1 ThinkPad|


  @RegressionTest
  Scenario Outline: TC: 11 - Validate if existing computer can be edited in the computer database with invalid date format
    And navigate to <compName>
    And edit the date with <invalidDate> and <editedComputerName>
    Then verify that computer cannot be saved

    Examples:
    |compName|editedComputerName|invalidDate|
    |Lenovo X1 ThinkPad Carbon 3rd Generation|Lenovo X1 ThinkPad|2019-01-32|


  @RegressionTest
    Scenario Outline: TC: 14 - Validate if the computer name can be removed from an existing computer in the computer database
      And navigate to <computerName>
      Then validate that computer cannot be edited if computer name is removed

      Examples:
        |computerName|
        |Lenovo X1 ThinkPad Carbon|