package com.mmt.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.base.BaseTest;

public class HomePage extends BaseTest {
	
   @FindBy(xpath="//a[contains(@class,'headerIcons') and contains(@class,'active')]")
   WebElement flightMenu;
   
   @FindBy(xpath="//li[@data-cy='roundTrip']")
   WebElement roundTripMenu;
   
   @FindBy(xpath="//input[@id='fromCity']")
   WebElement cityDropdownclick;
   
   @FindBy(xpath="//input[@placeholder='From']")
   WebElement searchFromCityName;
   
   @FindBy(xpath="//input[@placeholder='To']")
   WebElement searchToCityName;
   
   @FindBy(xpath="//input[@id='departure']")
   WebElement departuredateDropdownOpen;
   
   @FindBy(xpath="//input[@id='return']")
   WebElement returnDateDropdownOpen;
   
   String departureDate= "//div[@aria-label='%replace%' and @aria-disabled='false']";
   String returnDate= "//div[@aria-label='%replace%' and @aria-disabled='false']";
   
   @FindBy(xpath="//a[contains(@class,'widgetSearchBtn') and text()='Search']")
   WebElement searchbutton;
   
   public HomePage() {
	   super();
	   PageFactory.initElements(driver, this);
	   
   }
   
   //methods
   public void selectFlightMenu() {
	   flightMenu.click();
   }
   
   public void selectRoundTripMenu() {
	   roundTripMenu.click();
   }
   
   public void selectDepartureCity() {
	   cityDropdownclick.click();
	   searchFromCityName.sendKeys(config.getProperty("From"));
	   searchFromCityName.sendKeys(Keys.TAB);
	   
   }
   
   public void selectReturnCity() {
	   searchToCityName.sendKeys(config.getProperty("To"));
	   searchToCityName.sendKeys(Keys.TAB);
	   
   }
   
   public void selectDepartureDate() {
	   departuredateDropdownOpen.click();
	   //select the date -reusable method use from testutils class
	   
   }
   
   
   
   
   
   
   
   
   
   
   
}
