package com.qa.PetClinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {
	@FindBy(name = "Firstname")
	private WebElement FirstnameBox;
	@FindBy(name = "Lastname")
	private WebElement LastnameBox;
	@FindBy(name = "Address")
	private WebElement AddressBox;
	@FindBy(name = "//*[@id=\"city\"]")
	private WebElement CityBox;
	@FindBy(name = "//*[@id=\"telephone\"]")
	private WebElement TelephoneBox;
	@FindBy(name = "/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
	private WebElement AddOwner;
	
	
	public void enterdetails() {
		FirstnameBox.sendKeys("saad");
		LastnameBox.sendKeys("Israr");
		AddressBox.sendKeys("3, Liverpool Road");
		CityBox.sendKeys("Liverpool");
		TelephoneBox.sendKeys("07856554896");
		AddOwner.click();
	}
	
	
	

}
