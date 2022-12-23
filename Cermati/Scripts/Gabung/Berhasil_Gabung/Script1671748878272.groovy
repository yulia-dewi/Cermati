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

WebUI.openBrowser('https://www.cermati.com/gabung')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Gabung/Register/input_email'), 'newsatu@yopmail.com')

WebUI.setText(findTestObject('Gabung/Register/input_mobilePhone'), '0899123456')

WebUI.setText(findTestObject('Gabung/Register/input_password'), 'Newsatu1')

WebUI.setText(findTestObject('Gabung/Register/input_confirmPassword'), 'Newsatu1')

WebUI.setText(findTestObject('Gabung/Register/input_firstName'), 'Baru')

WebUI.setText(findTestObject('Gabung/Register/input_lastName'), 'Terakhir')

WebUI.setText(findTestObject('Gabung/Register/input_cityProvince'), 'KOTA JAKARTA BARAT')

WebUI.sendKeys(findTestObject('Gabung/Register/input_cityProvince'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Gabung/Register/input_firstName'), 0)

WebUI.click(findTestObject('Gabung/Register/input_firstName'))

WebUI.scrollToElement(findTestObject('Gabung/Register/button_daftar'), 0)

WebUI.click(findTestObject('Gabung/Register/button_daftar'))

WebUI.verifyElementPresent(findTestObject('Gabung/Register/label_pilihVerifikasi'), 5)

