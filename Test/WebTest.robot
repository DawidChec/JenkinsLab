*** Settings ***

Documentation   Webtest
Library  SeleniumLibrary
Resource    ../Resources/Keywords.robot
Suite Setup     Begin Web Test
Suite Teardown  End Web Test

*** Variables ***
${BROWSER}  chrome
${URL}  http://rental5.infotiv.net/
${FIRST_NAME}   Johan
${LAST_NAME}    Olsson
${PHONE_NUMBER}  123123123
${MAIL}  Johan.Olsson@gmail.com
${PASSWORD}  secret

*** Test Cases ***

User Can Cancel Create A User
    [Documentation]     Testing that user can cancel creating a user.
    [Tags]  G_Krav1
    Go To Create User
    Cancel Creating User

User Need To be Signed In To Book A Car

    [Documentation]     Testing that an alert box will appear if user is not signed in when booking car.
    [Tags]      G_Krav2
    Go To Car Rental
    Select Car Not Signed In
    Verify Alert Box Appears
    Confirm Back To Home Page


