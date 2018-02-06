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

'Select Forms Manager'
WebUI.click(findTestObject('DropDown/DropDown_Action/a_Forms Manager'))

WebUI.click(findTestObject('Forms_Manager/Forms_Library_Tab/My_Forms_Package_Tab'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Package_Icon'))

WebUI.waitForElementVisible(findTestObject('Forms_Manager/My_Forms_Package/Add_Package_Modal'), 5)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Package_Package_Name_Field'))

WebUI.sendKeys(findTestObject('Forms_Manager/My_Forms_Package/Add_Package_Package_Name_Field'), 'My Forms Package Test')

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Package_Btn'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Library_Forms_Icon'))

WebUI.waitForElementVisible(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_To_Package_Modal'), 5)

WebUI.sendKeys(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_To_Package_Search_Field'), 'f21')

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_To_Package_Search_Button'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Select_First_Form_From_List'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Arrow_Add_To_Selected_Forms'))

not_run: WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject('Forms_Manager/My_Forms_Package/F21_Selected_Forms'), 2)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Add_Forms_Btn'))

not_run: WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject('Forms_Manager/My_Forms_Package/F21_Displaying_In_My_Forms_Package'), 2)

not_run: WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Edit_Package_Name_Icon'))

not_run: WebUI.waitForElementPresent(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Name_Modal'), 0)

not_run: WebUI.doubleClick(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Package_Name_Field'))

not_run: WebUI.setText(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Package_Name_Field'), '123')

not_run: WebUI.waitForElementPresent(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Form_Name_Modal'), 5)

not_run: WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Form_Name_Field'))

not_run: WebUI.sendKeys(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Form_Name_Field'), 'test')

not_run: WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Update_Package_Form_Name_Btn'))

not_run: WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Select_First_Form_In_My_Forms_Package_List'))

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Remove_Forms_In_My_Forms_Package'))

WebUI.waitForElementPresent(findTestObject('Forms_Manager/My_Forms_Package/Remove_Forms_From_Package_Modal'), 0)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Delete_Btn'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Forms_Manager/My_Forms_Package/Inactive_Package_Icon'))

