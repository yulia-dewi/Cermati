package gabungRegister

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class gabungRegister {
	
	@Given("Gabung page is loaded successfully")
	def load_gabung_page() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Load Gabung Page"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("the user input the email (.*) and phone number (.*)")
	def input_username(String user_email, String phone_number) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input Email Phone"), [ ('user_email') : user_email, ('phone_number') : phone_number ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("the user password (.*) and confirm password (.*)")
	def input_password(String password,String confirm_pswd) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input Password"), [ ('password') : password,('confirm_pswd') : confirm_pswd ], FailureHandling.STOP_ON_FAILURE)
	}

	
	@And("the user input first name (.*) and last name (.*)")
	def input_user_name(String first_name, String last_name) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input User Name"), [ ('first_name') : first_name,('last_name') : last_name ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("the user input district or city (.*)")
	def input_district_city(String district_city) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input District City"), [ ('district_city') : district_city ], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("the user click button Daftar")
	def click_daftar() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Click Daftar"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("register success and go to next step")
	def verify_nextpage() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Page Method Verify"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
}

