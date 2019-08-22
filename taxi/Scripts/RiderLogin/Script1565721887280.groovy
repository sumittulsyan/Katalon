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

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Sign In'), 0)

Mobile.setText(findTestObject('riderSignIn/android.widget.EditText0 - Email'), 'taxirider@gmail.com', 0)

Mobile.setText(findTestObject('riderSignIn/android.widget.EditText0 - Password'), '123456', 0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Sign In (1)'), 0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Bannerghatta Main Road BTM Layout 2nd Stage 2nd Main Road No 18 First Floor Bengaluru Karnataka 560076 India'), 
    0)

not_run: Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - 4 Ranka Colony Rd Munivenkatppa Layout Bilekahalli Bengaluru Karnataka 560076 India'), 
    0)

not_run: Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - GeekyAnts Software Pvt Ltd Industrial Area Stage 2 BTM 2nd Stage Bengaluru Karnataka India (1)'), 
    0)

not_run: Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - 10 10th Cross Rd Mahadeshwara Nagar Stage 2 BTM Layout Bengaluru Karnataka 560076 India'), 
    0)

not_run: Mobile.tap(findTestObject('rider/android.widget.TextView0 - Bannerghatta Main Road BTM Layout 2nd Stage 2nd Main Road No 18 First Floor Bengaluru Karnataka 560076 India'), 
    0)

not_run: Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - 346next to gopalan mall 3rd Phase J. P. Nagar Bengaluru Karnataka 560078 India'), 
    0)

not_run: Mobile.setText(findTestObject('riderSignIn/android.widget.EditText0 - Search for locality or place'), 'geekyants', 
    0)

not_run: Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - GeekyAnts Software Pvt Ltd Industrial Area Stage 2 BTM 2nd Stage Bengaluru Karnataka India'), 
    0)

Mobile.setText(findTestObject('riderSignIn/android.widget.EditText0 - Search for locality or place (1)'), 'Ranka colony', 
    0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Ranka Colony Bilekahalli Bengaluru Karnataka India'), 
    0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Enter Drop Location'), 0)

Mobile.setText(findTestObject('riderSignIn/android.widget.EditText0 - Search for locality or place'), 'silk board', 0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Silk board bus stand Central Silk Board Colony Stage 2 BTM Layout Bengaluru Karnataka India'), 
    0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Book Ride'), 0)

Mobile.tap(findTestObject('riderSignIn/android.widget.TextView0 - Request Taxi'), 0)

Thread.sleep(10000000)

