@wp
Feature: Navigation Menu

  Background:
    Given User is on the home page

  Scenario: As a user I can access sub-sections of each sub-menu in the header of the homepage


    Then User can not see sub-menu modules
    Then User can see sub-menu modules after hover over



  Scenario: As a user I cannot send an empty message in ‘contact us
    When User clicks on Contact us Button
    And User clicks on Send button
    Then Verify that warning messages
    Then Verify that error icons



