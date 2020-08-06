package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.BaseStaticDriver;

public class SearchTaken extends BaseStaticDriver {
    @Then("^search a \"([^\"]*)\" and click search button$")
    public void searchAAndClickSearchButton(String takenDomainName) {
        //send search keys
        driver.findElement(By.id("search-box")).sendKeys(takenDomainName);
        //click search button
        driver.findElement(By.cssSelector("span[class='input-group-btn']")).click();
        driver.quit();
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
