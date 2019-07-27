package stepDefination;

import cucumber.api.java.Before;
import utils.Log;
import utils.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	Log.info("Setting up Driver");
       SeleniumDriver.setUpDriver();
    }
}
