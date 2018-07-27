package com.qa.PetClinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetTypes {
	@FindBy (xpath = "/html/body/app-root/div[1]/nav/div/ul/li[4]/a")
	private WebElement PetTypes;
	
public void getPettypes() {
	PetTypes.click();
}

}


