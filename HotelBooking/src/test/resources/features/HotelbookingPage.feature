Feature: Hotel Booking Page

#Background:
#Given User is on Hotel Booking Application-Hotel Booking Page

  Scenario: Verify Hotel Booking page heading
  Given User is on Hotel Booking Application-Hotel Booking Page
    Then Page title should be "Hotel Booking" 

  Scenario: Validate alert message for not giving Firstname
  Given User is on Hotel Booking Application-Hotel Booking Page
    When User clicks Confirm Booking button without giving "Firstname" 
    Then Should get Alert message "Please fill the First Name" 

  Scenario: Validate alert message for not giving Lastname
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    When User clicks Confirm Booking button without giving "Lastname" 
    Then Should get Alert message "Please fill the Last Name" 
  
  Scenario: Validate alert message for invalid mailID format
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    When User clicks Confirm Booking button without giving "mailID" 
    Then Should get Alert message "Please fill the Email" 
    
  Scenario: Validate alert message for invalid mailID format
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    When User enters invalid mailID format "aaa@com" 
    And User clicks Confirm Booking button
    Then Should get Alert message "Please enter valid Email Id."  
    
  Scenario: Validate alert message for not giving Mobile number
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    When User clicks Confirm Booking button without giving "Mobilenumber" 
    Then Should get Alert message "Please fill the Mobile No." 
    
   Scenario: Validate alert message for invalid Mobile number
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    When User enters invalid mobile number "4567891230"
    And User clicks Confirm Booking button
    Then Should get Alert message "Please enter valid Contact no." 
    

   Scenario: Validate alert message for invalid Mobile number
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    When User enters invalid mobile number "1234567890"
    And User clicks Confirm Booking button
    Then Should get Alert message "Please enter valid Contact no." 
  
    
   Scenario: Validate alert message for invalid Mobile number
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    When User enters invalid mobile number "98765"
    And User clicks Confirm Booking button
    Then Should get Alert message "Please enter valid Contact no." 
 
      
  Scenario: Validate alert message for not giving City
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test"
    When User clicks Confirm Booking button without giving "City" 
    Then Should get Alert message "Please select city" 
    
    
  Scenario: Validate alert message for not giving State
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com"     
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    When User clicks Confirm Booking button without giving "State" 
    Then Should get Alert message "Please select state" 
    
  Scenario: Validate alert message for not giving Card holder name
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    When User clicks Confirm Booking button without giving "Card holder name" 
    Then Should get Alert message "Please fill the Card holder name" 
    
  Scenario: Validate alert message for not giving Debit card Number
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    And User entered Card holder name "test"
    When User clicks Confirm Booking button without giving "Debit card Number" 
    Then Should get Alert message "Please fill the Debit card Number" 
    
    
  Scenario: Validate alert message for not giving CVV
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210"  
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    And User entered Card holder name "test" 
    And User entered Debit card Number "123" 
    When User clicks Confirm Booking button without giving "CVV" 
    Then Should get Alert message "Please fill the CVV"  
    
  Scenario: Validate alert message for not giving Expiration Month
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    And User entered Card holder name "test" 
    And User entered Debit card Number "123" 
    And User entered CVV "123" 
    When User clicks Confirm Booking button without giving "Expiration Month" 
    Then Should get Alert message "Please fill expiration month" 
    
  Scenario: Validate alert message for not giving Expiration Year
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    And User entered Card holder name "test" 
    And User entered Debit card Number "123" 
    And User entered CVV "123" 
    And User entered Expiration Month "12"
    When User clicks Confirm Booking button without giving "Expiration Year" 
    Then Should get Alert message "Please fill the expiration year" 
    
  Scenario: Validate Happy flow
    Given User is on Hotel Booking Application-Hotel Booking Page
    And User entered Firstname "test" 
    And User entered Lastname "test" 
    And User entered valid mailID "test@test.com" 
    And User entered valid mobile number "9876543210" 
    And User entered Number of Guest staying "2" 
    And User filled the Address text box "test" 
    And User selects the City "Chennai" 
    And User selects the state "Tamilnadu" 
    And User entered Card holder name "test" 
    And User entered Debit card Number "123" 
    And User entered CVV "123" 
    And User entered Expiration Month "12" 
    And User entered Expiration Year "2020" 
    When User clicks Confirm Booking button
    Then Page should display "Booking Completed!" 
    And Page title should be "Payment Details" 
    