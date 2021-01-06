Feature: Login Page

Background:
Given User is on Hotel Booking Application-Login page

  Scenario: Verify login page heading
    
    Then Verify Page heading is "Hotel Booking Application" using Xpath

  Scenario: Username error message Test
    When User clicks Login button without entering "Username"
    Then Should get username error message "* Please enter userName."

  Scenario: Password error message Test
    When User enters username "admin"
    And User clicks Login button without entering "Password"
    Then Should get password error message "* Please enter password."

  Scenario: Login Happy flow
    When User enters username "admin"
    And User enters Password "admin"
    And User clicks Login
    Then User should be navigated to hotelbooking Page
