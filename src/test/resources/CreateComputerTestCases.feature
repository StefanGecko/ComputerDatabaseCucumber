@feature_create
  Feature: Create computer test cases

  Background:
    Given open home page


  @RegressionTest
  Scenario Outline: TC: 03 - Validate if a single computer can be added in the computer database web application
    And click to add a new computer
    And input correct <computerNameTestData> to create new computer
    Then Validate that computer is successfuly created

    Examples:
    |computerNameTestData|
    |Lenovo X1 ThinkPad Carbon 3rd Generation|

   @RegressionTest
   Scenario Outline: TC: 04 - Validate if a single computer can be added in the computer database web application with special characters in the name
     And click to add new computer with invalid name
     And add data containing <specialCharatersComputerName> in computer name
     Then Validate computer is added with special characters in computer name

     Examples:
     |specialCharatersComputerName|
     |Lenovo$%^&*(|

   @RegressionTest
   Scenario Outline: TC: 05 - Validate if new computer can be added to the computer database when the year is set to 0000 as introduced date and 9999 as discounted date
     And click to add new computer with boundary values for introduced date and discontinued date
     And enter data for <introducedDate> and <discontinuedDate> and <computerName>
     Then validate that computer is added with boundary values for <dateformatValidation> and <dateformatValidation>

     Examples:
     |introducedDate| discontinuedDate|computerName|dateformatValidation|
     |0000-01-01 |9999-01-01|Dell inspiron 15 3000 series|01 Jan 0000   |


   @RegressionTest
   Scenario Outline: TC: 07 - Validate if new computer can be added to the computer database with the same name as an existing computer
     And click to add new computer with same computer name
     And add computer with the same <computerNameTestData>
     Then validate that computer is added with the same computer name

     Examples:
       |computerNameTestData|
       |Lenovo X1 ThinkPad Carbon 3rd Generation|

   @RegressionTest
   Scenario Outline: TC: 08 - Validate if new computer can be added to the computer database when computer name field is blank
     And click to add new computer with blank computer name
     And add <introducedDate> and <discontinuedDate> for the computer details
     Then validate that computer cannot be created with blank computer name

       Examples:
       |introducedDate| discontinuedDate|
       |2019-01-31 |2029-01-32 |


