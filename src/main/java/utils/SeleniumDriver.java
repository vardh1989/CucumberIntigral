package utils;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import org.openqa.selenium.JavascriptExecutor;



public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    //initialize webdriver
    private static WebDriver driver;
    
    //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    
    //Setup Chrome Browser
    private  SeleniumDriver() {

    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/resources/chromedriver");
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

    	driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        String window=driver.getWindowHandle();
        Log.info("Current Window -> "+window);
       
    }

    public static void openPage(String url) {
    	Log.info("Opening Url "+url);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
       if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
      
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
    public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    //Scroll Down to page
    public static void scrollDown() throws InterruptedException {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	Thread.sleep(5000);
    	
    }
}
