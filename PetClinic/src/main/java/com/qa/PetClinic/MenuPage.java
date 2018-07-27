package com.qa.PetClinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	@FindBy(xpath ="/html/body/app-root/div[1]/nav/div/ul/li[1]/a")
	private WebElement HomePage;
	@FindBy(xpath ="/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
	private WebElement Ownersbutton;
	@FindBy(xpath ="/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[2]/a")
	private WebElement AddNew;
	@FindBy(xpath = "//*[@id=\"firstName\"]")
	private WebElement FirstName;
	@FindBy(xpath = "//*[@id=\"lastName\"]")
	private WebElement LastName;
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement Address;
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement City;
	@FindBy(xpath = "//*[@id=\"telephone\"]")
	private WebElement Telephone;
	@FindBy(xpath = "/html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]")
	private WebElement AddOwner;
	
	public String getHomePage() {
		return HomePage.getText();
	}	
	public void getOwnersbutton() {
		Ownersbutton.click();
	}
	public void getAddnew() {
		AddNew.click();
	}
	public void getFirstname() {
		FirstName.click();
		}
	public void getLastname() {
		LastName.click();
		}
	public void getAddress() {
		Address.click();
		}
	public void getCity() {
		City.click();
		}
	public void getTelephone() {
		Telephone.click();
		}
	public void getAddOwner() {
		AddOwner.click();
	}
	
	}
