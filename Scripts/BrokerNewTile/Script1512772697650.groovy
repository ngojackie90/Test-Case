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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://abcrealty.stage.myrdocs.com/PL/Default.aspx')

WebUI.sendKeys(findTestObject('AddContact/input_txtUserName'), 'stage.companybroker')

WebUI.sendKeys(findTestObject('AddContact/input_txtPassword'), 'aaaa')

WebUI.click(findTestObject('AddContact/input_btnLogin'))

WebUI.click(findTestObject('AddContact/a_Create New'))

'Waiting for tile to be created'
WebUI.waitForPageLoad(5)

//Select Contact Button
WebUI.click(findTestObject('AddContact/input_ctl00MainContentlstFolde'))

//Select Contact Type
WebUI.click(findTestObject('AddContact/input_ctl00MainContentContactG'))

'Wait for contact page to load'
WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('AddContact/Page_rDocs/Page_rDocs/div_MdlContact'), 10)

WebUI.switchToFrame(findTestObject('AddContact/Page_rDocs/Page_rDocs/div_MdlContact'), 0)

WebUI.click(findTestObject('AddContact/Page_rDocs (2)/input_ctl00MainContentContactG'))

WebUI.selectOptionByValue(findTestObject('AddContact/select_ctl00MainContentddlCont'), 'appraiser', true)

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtFirst'), 'Jackie')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtLastN'), 'Buyer')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtCompa'), 'A Company')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtAddre'), '1 Main Street')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtCity'), 'Irvine')

WebUI.selectOptionByValue(findTestObject('AddContact/select_ctl00MainContentddlStat'), 'CA', true)

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtZip'), '92656')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtEmail'), 'jngoqa@gmail.com')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtWorkP'), '999-999-9999')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtHomeP'), '888-888-8888')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtMobil'), '777-777-7777')

WebUI.sendKeys(findTestObject('AddContact/input_ctl00MainContenttxtFaxNu'), '666-666-6666')

WebUI.click(findTestObject('AddContact/a_Submit'))

not_run: WebUI.closeBrowser()

