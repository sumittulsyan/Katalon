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

Mobile.tap(findTestObject('driver/android.widget.TextView0 - Register (2)'), 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - First Name (1)'), 'fdgs', 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - Last Name'), 'setdrfgjhk', 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - Email'), 'ljhfoixs@kjtdft.com', 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - Mobile Number (1)'), '8888888888', 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - Password'), '123456', 0)

Mobile.setText(findTestObject('driver/android.widget.EditText0 - Confirm password'), '123456', 0)

Mobile.tap(findTestObject('driver/android.widget.TextView0 - Register (3)'), 1000)

Mobile.tap(findTestObject('driver/android.widget.TextView0 - Drivers License-Front (1)'), 0)

Mobile.tap(findTestObject('driver/android.widget.TextView0 - TAP TO ADD'), 0)

Mobile.tap(findTestObject('driver/android.widget.TextView0 - Take Photo (1)'), 0)

Mobile.tap(findTestObject('driver/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('driver/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('driver/android.widget.TextView0 - '), 0)

