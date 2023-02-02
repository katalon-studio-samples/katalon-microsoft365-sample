
# Introduction

This project demonstrates how katalon studio helps users to automate Microsoft Dynamic 365 applications. It contains some test cases for the powerBI. Because of the very dynamic nature of the PowerBI DOM structure, sometimes users need to make some necessary changes before recording the test cases.

# Requirements

* [Katalon Studio][KS]
* Users should have an active Microsoft 365 account.

# Use case

* Create and Delete a lead in Microsoft 365 account


# How to automate

**Costomize Setting before recording a test case**

* Go to project >> Settings >> Test Design >> WebUI and Change the priority of Xpath Locators. [Here][1]

![image](https://user-images.githubusercontent.com/84115288/214218084-b99e47c5-be63-49ad-89c2-fb4bcbcebb83.png)


* Record test script via Katalon Recorder.

* Save test objects and test cases.

* Run the test execution. [Here][2]

* Verify the test execution result. [Here][3]

**After Recording a test case if execution is failing because of "Element not interactable" exception then please change keyword "Click" to "Enhanced Click"**

* ![image](https://user-images.githubusercontent.com/84115288/215332439-3e64dd51-bb71-492f-abe3-63417d912e51.png)


**How to run this sample project**

* Update the application URL, Username, and Password inside the Default Profile.

![image](https://user-images.githubusercontent.com/84115288/215332701-03403257-b0cd-4627-b9b4-48f805b538c8.png)


* Run the test execution.[Here][2]

* Verify the test execution result.[Here][3]

[KS]: <https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows#download-katalon-studio> "Katalon Studio"
[1]: <https://docs.katalon.com/docs/maintain/self-healing-tests-in-katalon-studio#configure-test-design> "Here"

[2]: <https://docs.katalon.com/docs/execute/execute-tests-with-katalon-studio/execute-tests-with-katalon-studio-overview#ariaid-title1> "Here"
[3]: <https://docs.katalon.com/docs/analyze/reports/view-test-reports/view-test-reports-in-katalon-testops/view-test-results-and-execution-logs-in-katalon-testops#ariaid-title1> "Here"
