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

WebUI.navigateToUrl('https://climate.emerson.com/en-us')

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_About Us'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_Investors'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_Careers'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_News  Events'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_Sign In'))

WebUI.click(findTestObject('Object Repository/04252022_Climate_Blackbar_Navigation/Page_HVACR Technology and Infrastructure So_f4d782/a_Emerson.com'))

WebUI.closeBrowser()

