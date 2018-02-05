import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/4z/yj4n2zfs4tl1njdrc6h00g8h0000gq/T/Katalon/Test Cases/Add_Edit_Clause/20180205_112517/execution.properties')

TestCaseMain.beforeStart()
try {
    
        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('BrokerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://abcrealty.stage.myrdocs.com/PL/Default.aspx')

not_run: WebUI.setText(findTestObject('Page_rDocs (9)/input_txtUserName'), 'stage.companybroker')

not_run: WebUI.setText(findTestObject('Page_rDocs (9)/input_txtPassword'), 'aaaa')

not_run: WebUI.click(findTestObject('Page_rDocs (9)/input_btnLogin'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_rDocs (9)/a_Select'), 'a_Forms Manager', false)

not_run: WebUI.navigateToUrl('http://abcrealty.stage.myrdocs.com/PL/FormsLibrary.aspx')

not_run: WebUI.click(findTestObject('Page_rDocs (9)/a_Forms Manager'))

not_run: WebUI.click(findTestObject('Page_rDocs (9)/a_Clauses'))

WebUI.click(findTestObject('Page_rDocs (9)/input_ctl00MainContentbtnAddCl'))

not_run: WebUI.click(findTestObject('Page_rDocs (9)/input_ctl00MainContenttbClause'))

WebUI.waitForElementPresent(findTestObject('Page_rDocs (9)/input_ctl00MainContenttbClause'), 30)

WebUI.setText(findTestObject('Page_rDocs (9)/input_ctl00MainContenttbClause'), 'QA Automate Clause Test')

WebUI.click(findTestObject('Page_rDOcs (9)/textarea_ctl00MainContenttbCla'))

WebUI.sendKeys(findTestObject('Page_rDocs (9)/textarea_ctl00MainContenttbCla'), 'Test')

WebUI.click(findTestObject('Page_rDocs (9)/input_ctl00MainContentbtnAddCl_1'))

WebUI.closeBrowser()

''', 'Test Cases/Add_Edit_Clause', new TestCaseBinding('Test Cases/Add_Edit_Clause', [:]), FailureHandling.STOP_ON_FAILURE )
    
} catch (Exception e) {
    TestCaseMain.logError(e, 'Test Cases/Add_Edit_Clause')
}
