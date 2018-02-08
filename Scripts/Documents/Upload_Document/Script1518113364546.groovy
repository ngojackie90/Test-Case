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

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/a_Documents'))

WebUI.click(findTestObject('Dashboard/Document/Add_Document_Btn_Doc_Page'))

WebUI.check(findTestObject('Dashboard/Document/Upload_Document_Modal/Upload_Document_via_Browser_Dropdown'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Document/Upload_Document_Modal/Upload_Document_Modal'), 5)

WebUI.setText(findTestObject('Dashboard/Document/Upload_Document_Modal/Document_Title_Field'), 'Document Automation')

WebUI.click(findTestObject('Dashboard/Document/Upload_Document_Modal/Choose_File_Btn'))

WebUI.uploadFile(findTestObject('Dashboard/Document/Upload_Document_Modal/Choose_File_Btn'), '/Users/Work/Downloads/zzztest.pdf')

WebUI.click(findTestObject('Dashboard/Document/Upload_Document_Modal/Upload_Close_Btn'))

WebUI.closeWindowIndex(null)

