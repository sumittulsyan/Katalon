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

Mobile.startApplication('/Users/sumittulsyan/Downloads/app-release (1).apk', true)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Register'), 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - First Name'), 'waresdtfghj', 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Last Name'), 'wretdyfgu', 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Email'), 'kgfef@yfdu.com', 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Mobile Number'), '0923456798', 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Password'), '123456', 0)

'Click Register'
Mobile.setText(findTestObject('rider/android.widget.EditText0 - Confirm password'), '123456', 30)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Register (1)'), 0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - 1600 Amphitheatre Pkwy Mountain View CA 94043 USA'), 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Search for locality or place'), 'Benarghatta', 0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - GeekyAnts Software Pvt Ltd Industrial Area Stage 2 BTM 2nd Stage Bengaluru Karnataka India'), 
    0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Enter Drop Location'), 0)

Mobile.setText(findTestObject('rider/android.widget.EditText0 - Search for locality or place'), 'silk board', 0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Silk board bus stand Central Silk Board Colony Stage 2 BTM Layout Bengaluru Karnataka India'), 
    0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Book Ride'), 0)

Mobile.tap(findTestObject('rider/android.widget.TextView0 - Request Taxi'), 50)

