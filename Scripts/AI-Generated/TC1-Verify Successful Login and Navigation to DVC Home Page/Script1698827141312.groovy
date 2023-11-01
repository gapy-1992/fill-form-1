import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on button start flow 1 --> navigate to Page dvc-login'

testObj = findTestObject('Object Repository/Page_home/button_start_flow_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page dvc-login input on input username'

testObj = findTestObject('Object Repository/Page_dvc-login/input_username')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_username)

'step 4: At Page dvc-login input on input password'

testObj = findTestObject('Object Repository/Page_dvc-login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-login(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_password)

'step 5: At Page dvc-login click on button login --> navigate to Page dvc-home'

testObj = findTestObject('Object Repository/Page_dvc-login/button_login')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page dvc-home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Login and Navigation to DVC Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
