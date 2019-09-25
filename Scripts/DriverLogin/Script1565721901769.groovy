import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/sumittulsyan/Downloads/app-release.apk', true)

Mobile.tap(findTestObject('driverSignIn/android.widget.TextView0 - Sign In'), 0)

Mobile.setText(findTestObject('driverSignIn/android.widget.EditText0 - Email'), 'taxidriver@gmail.com', 30)

Mobile.setText(findTestObject('driverSignIn/android.widget.EditText0 - Password'), '123456', 30)

Mobile.tap(findTestObject('driverSignIn/android.widget.TextView0 - Sign In (1)'), 0)

Mobile.tap(findTestObject('driverSignIn/android.widget.TextView0 - '), 0)

Mobile.tap(findTestObject('driverSignIn/android.widget.TextView0 - Accept'), 0)

Thread.sleep(10000000)

not_run: Thread.sleep(1000)

