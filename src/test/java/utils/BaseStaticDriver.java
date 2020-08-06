package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseStaticDriver {
    public static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDependency\\drivers\\chromedriver.exe");
         driver=new ChromeDriver();
    }
}
