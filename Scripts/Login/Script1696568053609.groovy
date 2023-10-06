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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/home/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_email'), 'vinsensius008@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_password'), 'vB31XdcLjIb1Mo8EbecJew==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login please wait'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_password'), 'vB31XdcLjIYWY467IGySaQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login please wait'))

WebUI.click(findTestObject('Object Repository/Page_Login/span_Forgot password'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password recovery_email'), 'vinsensius008@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Login/div_Password recovery                      _b0feb9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_password'), 'aSjXa3TkIdan3vR9nRNGOA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_password'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

