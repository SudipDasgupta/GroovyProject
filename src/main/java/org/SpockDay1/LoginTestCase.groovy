package org.SpockDay1

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver

class LoginTestCase extends GebSpec {
	
	def "successful login"(){
		given : "The user is on login page"
		def browser=new Browser()
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium Software\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe")
		browser.driver = new ChromeDriver()
		browser.go("http://newtours.demoaut.com/")
		
		when :"user enters correct credentials"
		LoginPageObjects.name.value("username1")
		//LoginPageObjects.password.value()
		
		then:"testing"
	}

}
