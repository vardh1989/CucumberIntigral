package pageLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Locators for Home/Welcome Screen
public class WelcomeScreenPageLocators {
	
	@FindBy(how=How.XPATH,using="//a[@class=\"header__btn-lang-2\"]")
	public WebElement languageEnglish;
	
	@FindBy(how=How.XPATH,using="//*[@class='rw-words rw-words-1 header__subscribe stick-to-top']")
	public WebElement subcribeNow;
	
	
	
	

}
