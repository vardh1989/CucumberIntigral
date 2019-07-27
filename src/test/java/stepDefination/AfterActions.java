package stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.Log;
import utils.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=SeleniumDriver.getDriver();
    	Log.info("Scenario "+scenario.getName()+" is"+ scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
    SeleniumDriver.tearDown();
    }
}
