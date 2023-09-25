import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dvc-home tax-form1 tax-form2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1/tax-form2')

'step 2: At Page dvc-home tax-form1 tax-form2 input on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object)

'step 3: At Page dvc-home tax-form1 tax-form2 input on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_object_1)

'step 4: At Page dvc-home tax-form1 tax-form2 input on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_object_2)

'step 5: At Page dvc-home tax-form1 tax-form2 input on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_object_3)

'step 6: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page dvc-home tax-form1 tax-form2 click on input object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page dvc-home tax-form1 tax-form2 click on button object --> navigate to Page dvc-home tax-form1 tax-form2 tax-form3'

testObj = findTestObject('Object Repository/Page_dvc-home/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: Add visual checkpoint at Page dvc-home tax-form1 tax-form2 tax-form3'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Successful Submission of Tax Form1 and Tax Form2_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
