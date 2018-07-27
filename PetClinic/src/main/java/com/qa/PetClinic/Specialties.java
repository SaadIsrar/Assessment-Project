package com.qa.PetClinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Specialties {
	@FindBy (xpath = "/html/body/app-root/div[1]/nav/div/ul/li[5]/a")
	private WebElement Specialties;
	
public void getPettypes() {
	Specialties.click();
	}
}
