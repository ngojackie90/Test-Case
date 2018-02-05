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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CreateAccount/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_rDocs/Page_rDocs/Page_rDocs/select_ctl00MainContentddlItem'), '100', true)

WebUI.click(findTestObject('Page_rDocs/Page_rDocs/a_MainContent_lvSiteList_btnUsers_15'))

not_run: WebUI.navigateToUrl('http://abcrealty.stage.myrdocs.com/PL/StaffList.aspx?levelid=1&siteid=93553')

WebUI.click(findTestObject('Page_rDocs (3)/a_Add User'))

WebUI.selectOptionByValue(findTestObject('Page_rDocs (3)/select_ctl00MainContentddlStaf'), '3', true)

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtFisrt'), findTestData('Creating New User').getValue(
        'FirstName', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtLastN'), findTestData('Creating New User').getValue(
        'LastName', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtWorkP'), findTestData('Creating New User').getValue(
        'WorkPhone', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtFax'), findTestData('Creating New User').getValue(
        'Fax', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtMlsId'), findTestData('Creating New User').getValue(
        'MLSID#', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtDreLi'), findTestData('Creating New User').getValue(
        'DRELicense#', 1))

WebUI.setText(findTestObject('Page_rDocs (3)/input_ctl00MainContenttxtEmail'), findTestData('Creating New User').getValue(
        'Email', 1))

WebUI.setText(findTestObject('Page_rDocs (4)/input_ctl00MainContenttxtUsern'), findTestData('Creating New User').getValue(
        'UserName', 1))

WebUI.click(findTestObject('Page_rDocs (3)/input_ctl00MainContentbtnEditP'))

WebUI.closeBrowser()

