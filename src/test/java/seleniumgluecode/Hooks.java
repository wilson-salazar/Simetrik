package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberCase = 0;

    @Before
    public void setUp(){
        numberCase++;
        System.out.println("Case number: " + numberCase);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.co");
    }

    @After
    public void tearDown() {
        System.out.println("Case number: " +numberCase+" Successful.");
       // driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }


}
