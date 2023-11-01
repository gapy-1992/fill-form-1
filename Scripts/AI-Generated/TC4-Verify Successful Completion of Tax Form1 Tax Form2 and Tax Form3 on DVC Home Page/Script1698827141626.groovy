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

'step 1: Navigate to Page dvc-home tax-form1 tax-form2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1/tax-form2')

'step 2: At Page dvc-home tax-form1 tax-form2 input on input name'

testObj = findTestObject('Object Repository/Page_dvc-home/input_search')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_search)

'step 3: At Page dvc-home tax-form1 tax-form2 input on input address'

testObj = findTestObject('Object Repository/Page_dvc-home/input_address')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_address)

'step 4: At Page dvc-home tax-form1 tax-form2 input on input phone'

testObj = findTestObject('Object Repository/Page_dvc-home/input_phone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_phone)

'step 5: At Page dvc-home tax-form1 tax-form2 input on input email'

testObj = findTestObject('Object Repository/Page_dvc-home/input_email')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_email)

'step 6: At Page dvc-home tax-form1 tax-form2 click on input combo box demo'

testObj = findTestObject('Object Repository/Page_dvc-home/input_combo_box_demo')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page dvc-home tax-form1 tax-form2 click on li combo box demo option 4'

testObj = findTestObject('Object Repository/Page_dvc-home/li_combo_box_demo_option_4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page dvc-home tax-form1 tax-form2 click on input combo box demo'

testObj = findTestObject('Object Repository/Page_dvc-home/input_combo_box_demo_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page dvc-home tax-form1 tax-form2 click on li combo box demo option 4'

testObj = findTestObject('Object Repository/Page_dvc-home/li_combo_box_demo_option_4_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page dvc-home tax-form1 tax-form2 click on input combo box demo'

testObj = findTestObject('Object Repository/Page_dvc-home/input_combo_box_demo_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page dvc-home tax-form1 tax-form2 click on li combo box demo option 4'

testObj = findTestObject('Object Repository/Page_dvc-home/li_combo_box_demo_option_4_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page dvc-home tax-form1 tax-form2 click on button next --> navigate to Page dvc-home tax-form1 tax-form2 tax-form3'

testObj = findTestObject('Object Repository/Page_dvc-home/button_next')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: Add visual checkpoint at Page dvc-home tax-form1 tax-form2 tax-form3'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Successful Completion of Tax Form1 Tax Form2 and Tax Form3 on DVC Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
