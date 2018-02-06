import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Default_Test_Case/Broker_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Default_Test_Case/Create_Tile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Dashboard__Client_Btn'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Modal'), 5)

WebUI.click(findTestObject('Dashboard/Contact/Add_Contact_Modal/Check_Buyer_Type'))

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/First_Name_Field'), 'Buyer One')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Last_Name_Field'), 'Automation')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Company_Name_Field'), 'Katalon')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Street_Address_Field'), '111 Main Street')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/City_Field'), 'Irvine')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Zip_Code_Field'), '92656')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Email_1_Field'), 'jngoqa@gmail.com')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Work_Phone_Field'), '999-999-9999')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Home_Phone_Field'), '888-888-8888')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Mobile_Phone_Field'), '777-777-7777')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Fax_Number_Field'), '666-666-6666')

WebUI.click(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Submit_Btn'))

WebUI.waitForPageLoad(4)

WebUI.waitForElementClickable(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Plus_Icon'), 4)

WebUI.click(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Plus_Icon'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Modal'), 5)

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/First_Name_Field'), 'Buyer Two')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Last_Name_Field'), 'Automation')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Company_Name_Field'), 'Katalon')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Street_Address_Field'), '222 Main Street')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/City_Field'), 'Lake Forest')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Zip_Code_Field'), '92655')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Email_1_Field'), 'jngoqa2@gmail.com')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Work_Phone_Field'), '999-999-9999')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Home_Phone_Field'), '888-888-8888')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Mobile_Phone_Field'), '777-777-7777')

WebUI.setText(findTestObject('Dashboard/Contact/Add_Contact_Modal/Fax_Number_Field'), '666-666-6666')

WebUI.click(findTestObject('Dashboard/Contact/Add_Contact_Modal/Add_Contact_Submit_Btn'))

not_run: WebUI.callTestCase(findTestCase('Default_Test_Case/Broker_Log_Out'), [:], FailureHandling.STOP_ON_FAILURE)

