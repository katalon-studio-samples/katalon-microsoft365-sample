import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.microsoftonline.com/6ed35b6e-de5d-4127-bbe5-a63a4ea2f866/oauth2/authorize?client_id=00000007-0000-0000-c000-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid+profile&state=OpenIdConnect.AuthenticationProperties%3dMAAAAFjY7nSqoxHsiqPS2XMpNC5_eqw3iK1G8z8KkwKEjg81QvHJpzMMv5YV7UH64jdjlQEAAAABAAAACS5yZWRpcmVjdCZodHRwczovL29yZzU5NjFkNzQ4LmNybTguZHluYW1pY3MuY29tLw%26RedirectTo%3dMAAAAFjY7nSqoxHsiqPS2XMpNC7ev%252B3ePM0V%252B5OoyAUr2rdKzimO6oLdLx%252FlYi%252BCK80YR2h0dHBzOi8vb3JnNTk2MWQ3NDguY3JtOC5keW5hbWljcy5jb20v&nonce=637853814065570628.ZjkzNDY3MGUtNDZjZi00OGI2LWJkNzMtNDk1ODBjODAyOWE2ZTAwMTRmZDItZmUyMi00NjdhLTgyYjQtMTdkNjVjY2U4ODQ5&redirect_uri=https%3a%2f%2fmaa--indcrmlivesg604.crm8.dynamics.com%2f&max_age=86400')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Sign in_loginfmt'), 'Enter your username')

WebUI.enhancedClick(findTestObject('Object Repository/OR Microsoft 365/input_Sign in_idSIButton9'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Microsoft 365/div_Enter password'), 10)

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Enter password_passwd'), 'Enter your password')

WebUI.enhancedClick(findTestObject('Object Repository/OR Microsoft 365/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/input_concat(Stay signed in so you don, , t_4104e6'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/input_concat(Don, , t show this again)_idSIButton9'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Microsoft 365/span_Dynamics 365'), 60)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/img'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Search for records across multiple ent_0eb545'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Lead'))

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Topic_id-aa7c154f-e2f8-45db-b780-a9a8_387019'), 'Test Lead')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Budget Amount_id-aa7c154f-e2f8-45db-b_f558ac'), '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Microsoft 365/select_--Select--ImmediateThis QuarterNext _81daba'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Microsoft 365/select_--Select--AdvertisementEmployee Refe_e1d32e'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_First Name_id-aa7c154f-e2f8-45db-b780_cc8db7'), 'Kumar')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Last Name_id-aa7c154f-e2f8-45db-b780-_3bfe96'), 'Mohit')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Job Title_id-aa7c154f-e2f8-45db-b780-_66bb21'), 'QA')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Company Name_id-aa7c154f-e2f8-45db-b7_bdcdac'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Email_id-aa7c154f-e2f8-45db-b780-a9a8_4951d4'), 'abc@katalon.com')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/input_Mobile Phone_id-aa7c154f-e2f8-45db-b7_027664'), '1234567890')

WebUI.setText(findTestObject('Object Repository/OR Microsoft 365/textarea_T'), 'Test demo')

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Leads'))

WebUI.enhancedClick(findTestObject('Object Repository/OR Microsoft 365/i_'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Delete'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/span_Delete_1'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/div_mk'))

WebUI.click(findTestObject('Object Repository/OR Microsoft 365/button_Sign out'))

WebUI.closeBrowser()

