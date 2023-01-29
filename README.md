
# Introduction

This project demonstrates how katalon studio helps users to automate Microsoft Dynamic 365 applications. It contains some test cases for the powerBI. Because of the very dynamic nature of the PowerBI DOM structure, sometimes users need to make some necessary changes before recording the test cases.

# Requirements

* Katalon Studio
* Users should have an active Microsoft 365 account.

# Use case

* Create and Delete a lead in Microsoft 365 account


# How to automate

**Costomize Setting before recording a test case**

* Go to project >> Settings >> Test Design >> WebUI and Change the priority of Xpath Locators.

![image](https://user-images.githubusercontent.com/84115288/214218084-b99e47c5-be63-49ad-89c2-fb4bcbcebb83.png)


* Record test script via Katalon Recorder.

* Save test objects and test cases.

* Run the test on the browser.

* Verify the test result.

**After Recording a test case if execution is failing because of "Element not interactable" exception then please change keyword "Click" to "Enhanced Click"**

* ![image](https://user-images.githubusercontent.com/84115288/214219707-cee7a5cd-d1f3-4ac5-a2a2-009667e4d598.png)

**How to run this sample project**

* Update the application Salesforce application URL, Username, and Password inside the Default Profile.

<img width="818" alt="Katalon profile view" src="https://user-images.githubusercontent.com/1128/214109634-f63eebd2-4433-4c4a-9d9a-dcc89b10df34.png">

* Run the test on the browser.

* Verify the test result.


**Repository for the Sample Project:**
https://github.com/katalon-studio-samples/katalon-microsoft365-sample.git

Thanks.
