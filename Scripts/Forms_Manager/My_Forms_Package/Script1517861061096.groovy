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

WebUI.callTestCase(findTestCase('BrokerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

'Click dropdown select'
WebUI.click(findTestObject('DropDown/DropDown_Button/a_Select'), FailureHandling.STOP_ON_FAILURE)

'Select Forms Manager'
WebUI.click(findTestObject('DropDown/DropDown_Action/a_Forms Manager'))

WebUI.click(findTestObject('Forms_Manager/Forms_Library_Tab/My_Forms_Package_Tab'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Add_Package_Button'))

WebUI.waitForElementVisible(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Add_Package_Modal'), 30)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Add_Package_Name'))

WebUI.sendKeys(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Add_Package_Name'), 'My Forms Package Test')

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Submit_Add_Package_Button'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Page_rDocs/Add_Library_Forms_Button'))

WebUI.waitForElementVisible(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_To_Package_Modal'), 30)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_To_Package_Search_Field'))

WebUI.sendKeys(findTestObject(null), '')

