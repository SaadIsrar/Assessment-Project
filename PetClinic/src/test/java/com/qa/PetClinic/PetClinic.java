package com.qa.PetClinic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;

public class PetClinic {
	private WebDriver driver;
	private MenuPage menu;
	private PetCliniclogin loginpage;
	private AddUser add;
	private PetTypes pet;
	private Specialties spec;
	
	String url = "http://10.0.10.10:4200/petclinic/";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given ("^as an admin$")
	public void as_an_admin() {
		driver.get(url);
		assertEquals(url, driver.getCurrentUrl());
	}
	@When("^i get on the main menuhomepage$")
	public void i_get_on_the_main_homepage() {
		menu = PageFactory.initElements(driver, MenuPage.class);
		driver.get(url);
		assertEquals("menu", driver.getCurrentUrl());
	}
	@Then("^i click add new user$")
	public void i_click_add_new() {
		loginpage = PageFactory.initElements(driver, PetCliniclogin.class);
		driver.get(url);
		assertEquals(url, driver.getCurrentUrl());
	}
	@Given ("^i add the details$")
	public void i_add_the_details() {
		add = PageFactory.initElements(driver, AddUser.class);
		driver.get(url);
		assertEquals("add", driver.getCurrentUrl());
	}
	@When ("^i navigate to the pet types")
	public void i_navigate_to_the_pet_types() {
		pet = PageFactory.initElements(driver, PetTypes.class);
		driver.get(url);
		assertEquals(url, driver.getCurrentUrl());	
	}
	@Then("^i also navigate to the specialties")
	public void i_also_navigate_to_the_specialties() {
		spec = PageFactory.initElements(driver, Specialties.class);
		driver.get(url);
		assertEquals(url, driver.getCurrentUrl());
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
