package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Login extends Driver {
     WebDriver driver;

    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.get("https://www.godaddy.com/partners/domain-investors");
        driver.manage().window().maximize();
    }

    @When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterValidAnd(String email, String password)  {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //tray open
        driver.findElement(By.cssSelector("a[class='tray-toggle']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 1);
//       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[data-track-name='sign_in_link']"))));
        //sign in button
        driver.findElement(By.cssSelector("a[data-track-name='sign_in_link']")).click();
        //user name
             driver.findElement(By.id("username")).sendKeys(email);
//        //password
       driver.findElement(By.id("password")).sendKeys(password);
//        //submit
        driver.findElement(By.id("submitBtn")).click();
//        //verify that you are submit


    }

    @Then("^User should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Sign In");
        driver.close();
    }


}
