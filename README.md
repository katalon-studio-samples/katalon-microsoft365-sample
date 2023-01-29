
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


**Repository for the Sample Project:**
https://github.com/katalon-studio-samples/katalon-microsoft365-sample.git

Thanks.
