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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_first_name'), 'vinsen')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_signatory_last_name'), 'resi')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_email'), 'vinsensiusrindaresi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_email'), 'vinsensius008@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), '1AWyN0HHOGs=')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), '')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Login_name'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Login_name'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_form-control btn-log bor_48151b'), '8121554556')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    'Your country', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Your country                        _da403c'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_land Islands_state'), '')

WebUI.click(findTestObject('Object Repository/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), 'RigbBhfdqODCgRPvQj8oqw==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Login_password'), 'aSjXa3TkIdan3vR9nRNGOA==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Next Step   please wait'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_Referral                               _f19fe5'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Referral_referral_general'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'Select', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'public', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_Description of your products or se_3a74f4'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Address line 1_company_street_no'), 
    'jogja')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_City_company_city'), 'jogja')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ZIP or Postal Code_company_postal_code'), 
    '10001')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_State  Province  Region_company_state'), 
    'Jogja')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_No_company_use_vat_id'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Email_signatory_email'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_First name                             _768944'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Email_signatory_email'), 'vinsensius008@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_ID Number_signatory_id_number'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_land Islands_form-control minor-edit _a4e6be'), 
    '8121554556')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Same as company address_address_same__59d90d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please Select a country --       _45f784'), 
    'ID', true)

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Holder_account_holder'), 
    'vinse')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Account Number_account_number'), 
    '123456')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Bank_bank'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    '-- Please select bank country --', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please select bank country --    _6e0ed3'), 
    'ID', true)

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_Account Holder                         _b037a2'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_Account Holder                         _b037a2'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_Account Holder                         _b037a2_1'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Branch Code or Routing Number_branch_code'), 
    '123')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_Branch Code or Routing Number_branch_code'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/span_NO'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/span_YES'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Dashboard/i_Mobipaid new UI_fa fa-times fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Dashboard/span_Support_icon'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Dashboard/span_Log Out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_MERCHANT LOGIN_email'), '')

WebUI.click(findTestObject('Object Repository/Page_Login/div_MERCHANT LOGIN                         _dba15e'))

WebUI.closeBrowser()

