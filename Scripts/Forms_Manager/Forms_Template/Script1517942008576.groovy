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

'Click dropdown select'
WebUI.click(findTestObject('DropDown/DropDown_Button/a_Select'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DropDown/DropDown_Action/a_Forms Manager'))

WebUI.click(findTestObject('Forms_Manager/Forms_Library_Tab/Forms_Template_Tab'))

WebUI.waitForElementNotPresent(findTestObject('Forms_Manager/Forms_Template/Processing_Modal'), 10)

WebUI.click(findTestObject('Forms_Manager/Forms_Template/i_icon-plus icon-white'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Forms_Manager/Forms_Template/Library_List_Modal'), 15)

WebUI.waitForElementPresent(findTestObject('Forms_Manager/Forms_Template/Datasheet_Under_List'), 5)

WebUI.click(findTestObject('Forms_Manager/Forms_Template/Datasheet_CheckBox'))

WebUI.click(findTestObject('Forms_Manager/Forms_Template/Add_Form_Template_Btn'))

WebUI.waitForElementNotPresent(findTestObject('Forms_Manager/Forms_Template/Processing_Modal'), 10)

WebUI.waitForElementPresent(findTestObject('Forms_Manager/Forms_Template/Page_rDocs (1)/iframe_MainContent_PdfWebContr'), 
    5)

WebUI.click(findTestObject('Forms_Manager/Forms_Template/Page_rDocs/Datasheet_CheckBox_Forms_Template_Page'))

WebUI.click(findTestObject('Forms_Manager/Forms_Template/Delete_Form_Btn'))

