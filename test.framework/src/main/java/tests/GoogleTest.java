package tests;

import org.testng.annotations.*;

public class GoogleTest extends GoogleSearchBase {
	
	@Test
	public void googleSearchNavigation() {
		isTitle("Google");
		enterSearchText(" festivals of India");
		clickEnterFromKeyboard();
		navigateToFirstLink();
		for(int i=0; i<3; i++) 
			driver.navigate().back();
		scrollToElementXpath("//span[contains(text(),'2021 Indian Calendar for Indian Festivals and Indi')]");
		driver.navigate().back();
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}


