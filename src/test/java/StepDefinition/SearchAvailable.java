package StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.Driver;


public class SearchAvailable extends Driver {
 WebDriver driver;
    @When("^search a domain name and click search button$")
    public void searchADomainNameAndClickSearchButton() {
        driver = Driver.getDriver();
    //send search keys
        driver.findElement(By.id("search-box")).sendKeys("TechnoStudy");
        //click search button
        driver.findElement(By.cssSelector("span[class='input-group-btn']")).click();
    }


    @Then("^user should be able too see available$")
    public void userShouldBeAbleTooSeeAvailable() {

        //verify domain name is available
        String text = driver.findElement(By.cssSelector("span[data-cy='tld-domain-only']")).getText();
        String fullText=text.concat(" is available");
        String fullSearchWord="TechnoStudy".toLowerCase().concat(".com is available");
        Assert.assertEquals(fullText,fullSearchWord);
        driver.quit();
    }
}
