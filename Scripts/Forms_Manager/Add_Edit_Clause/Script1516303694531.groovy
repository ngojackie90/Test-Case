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

'Login'
WebUI.callTestCase(findTestCase('Default_Test_Case/Broker_Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click dropdown select'
WebUI.click(findTestObject('DropDown/DropDown_Button/a_Select'), FailureHandling.STOP_ON_FAILURE)

'Select Forms Manager'
WebUI.click(findTestObject('DropDown/DropDown_Action/a_Forms Manager'))

'Click Clauses Tab'
WebUI.click(findTestObject('Forms_Manager/Forms_Library_Tab/Clauses_Tab'))

'Click Add Clause'
WebUI.click(findTestObject('Forms_Manager/Clause_Page/Add_Clause_Button'), FailureHandling.STOP_ON_FAILURE)

'Wait For Clause Modal'
WebUI.waitForElementVisible(findTestObject('Forms_Manager/Clause_Page/Clause_Modal'), 30)

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Clause_Name_Title_Field'))

'Input A Title'
WebUI.sendKeys(findTestObject('Forms_Manager/Clause_Page/Clause_Name_Title_Field'), 'QA Automate Clause Test')

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Clause_Name_Body_Field'))

'Input A Body'
WebUI.sendKeys(findTestObject('Forms_Manager/Clause_Page/Clause_Name_Body_Field'), 'Test')

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Submit_Clause_Button'))

WebUI.waitForElementPresent(findTestObject('Forms_Manager/Clause_Page/Page_rDocs/td_QA Automate Clause Test'), 0)

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Page_rDocs/Select_Clause_Clause_Page'))

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Page_rDocs/Clause_Page_Remove_Btn'))

WebUI.waitForElementVisible(findTestObject('Forms_Manager/Clause_Page/Page_rDocs/Remove_Clause_Modal'), 0)

WebUI.click(findTestObject('Forms_Manager/Clause_Page/Page_rDocs/Remove_Clause_Modal_To_Confirm_To_Remove_Btn'))

not_run: WebUI.closeBrowser()

