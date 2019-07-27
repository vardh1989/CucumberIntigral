package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageLocators.WelcomeScreenPageLocators;
import utils.Log;
import utils.SeleniumDriver;


public class WelcomeScreenPageActions {
	WelcomeScreenPageLocators welcome =null;
	
	//Initializing WebElements using PageFactory
	public WelcomeScreenPageActions() {
		this.welcome=new WelcomeScreenPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), welcome);
	}
	
	//change language to English 
	public void changeLanguage() {
		String language = welcome.languageEnglish.getText();
		welcome.languageEnglish.click();
		Log.info("User changed the language to "+language);
	}
	
	//Subscribe Now for 7 Days
	public void  subscribeFreeForSevenDays() {
		welcome.subcribeNow.click();
		
	}

}
