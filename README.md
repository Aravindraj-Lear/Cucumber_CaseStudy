# Cucumber_CaseStudy
Cucumber_CaseStudy

Case study on Test Automation and Selenium
Max Marks: 50
Assessment Parameters
1. Solution Completeness (including all requirements addressed) – 25 marks

2. Understanding Business requirement and implementing BDD Step defination (Feature
file), Proper Usage of PMO, Object Repository. Creating appropriate Selenium
WebDriver script according to the flow mentioned– 25 marks

Q1. Consider the provided flow and complete the task using Cucmber framework, Selenium
WebDriver using POM structure
1. Addressing each functional requirement stated in the problem statement while writing step definition for business requirement.
2. Appropriate usage of Selenium Web Driver API objects, import statements to accomplish given requirements in the problem statement

Flow:
1. Launch the application browser
2. Open the web page “login.html “ in the browser.
3. Verify login page heading as “Hotel Booking Application” using xpath.
4. Enter UserName. Ensure that displays the error message “Please enter UserName” upon clicking on the “Login” button without entering any data in the text box. Enter Password. Ensure that displays the error message “Please enter Password” upon clicking on the “Login” button without entering any data in the text box.
6. Enter “admin” as username and “admin” as password for valid login. For this authorized user it will move to next page called “Hotel booking”. 
7. Verify the title “Hotel Booking” of the page.
8. Enter First Name. Ensure that the alert box displays the message “Please fill the First Name” upon clicking on the button “Confirm Booking” without entering any data in the text box.
9. Enter Last Name. Ensure that the alert box displays the message “Please fill the Last Name” upon clicking on the button “Confirm Booking” without entering any data in the text box.
10. Enter Email.Ensure that the alert box displays the message “Plese fill the Email” upon wrong email format entered in the text box. 
11. Enter mobile no. Ensure that the alert box displays the message “Please fill the Mobile No.” upon clicking on the button “Confirm Booking” without entering any data in the text box.
12. Ensure that the alert box displays the message “Please enter valid Contact no.” upon clicking on the button “Confirm Booking” on entering wrong data that doesn’t start with either 7,8 or 9 and doesn’t have 10 digits in the text box.
13. Select Number of people staying at the Hotel. Ensure that the alert box displays the message “Number of people attending.” upon clicking on the button “Confirm Booking” without entering any data in the box.
14. Enter address details, validation for address.
15. Select City. Ensure that alert box display the message “Please select city” upon clicking on the button “Confirm Booking” without selecting any city.
16. Select State. Ensure that alert box display the message “Please select state” upon clicking on the button “Confirm Booking” without selecting any state.
17. Enter Card Holder Name. Ensure that the alert box displays the message “Please fill the Card holder name” upon clicking on the button “Confirm Booking” without entering any data in the text box.
18. Enter Debit card Number. Ensure that the alert box displays the message “Please fill the Debit card Number” upon clicking on the button “Confirm Booking” without entering any data in the text box.
19. Enter Card expiration month. Ensure that the alert box displays the message “Please fill expiration month” upon clicking on the button “Confirm Booking” without entering any data in the text box.
20. Enter Card expiration year. Ensure that the alert box displays the message “Please fill expiration year” upon clicking on the button “Confirm Booking” without entering any data in the text box.
21. Click on “Confirm Booking” button. Ensure that it navigates to success page which displays the message “Booking Completed!!!”.

The Test should do the following apart from the flow mentioned in the Q1.
a. Locate the UI elements using appropriate locators & fill the data in the form.
b. Close the browser window once the entire task completes.

