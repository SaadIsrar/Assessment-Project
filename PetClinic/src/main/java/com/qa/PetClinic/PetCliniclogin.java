package com.qa.PetClinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetCliniclogin {
	@FindBy(xpath ="/html/body/app-root/div[1]/nav/div/ul/li[1]/a")
	private WebElement menuHomepage;
	
	public void click() {
		menuHomepage.click();
	}

}
