package StepDefinition;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class SearchTaken extends Driver{
    WebDriver driver;
    @Then("^search a \"([^\"]*)\" and click search button$")
    public void searchAAndClickSearchButton(String takenDomainName) {
        driver = Driver.getDriver();
        //send search keys
        driver.findElement(By.id("search-box")).sendKeys(takenDomainName);
        //click search button
        driver.findElement(By.cssSelector("span[class='input-group-btn']")).click();

    }



//    @Then("^user should be able too see \"([^\"]*)\" taken$")
//    public void userShouldBeAbleTooSeeTaken(String takenDomainName) throws Throwable {
//        //verify domain name is available
//        String text = driver.findElement(By.cssSelector("span[data-cy='tld-domain-only']")).getText();
//        //  System.out.println(text);
//        String fullText=text.concat(" is taken");
//        String fullSearchWord=takenDomainName.toLowerCase().concat(".com is taken");
//        Assert.assertEquals(fullText,fullSearchWord);
//        driver.quit();
//    }
}
