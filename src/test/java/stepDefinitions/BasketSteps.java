package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonFunctions;

public class BasketSteps extends CommonFunctions
{
    @Given("^I'm on the home page \"([^\"]*)\"$")
    public void i_m_on_the_home_page(String url) throws Throwable {
        driver.get(url);
        driver.manage().window().maximize();
        WebElement elementInHomePage = driver.findElement(By.xpath("//a[text()='Help']"));
        Assert.assertTrue(elementInHomePage.isDisplayed());
    }

    @When("^I choose a menu option \"([^\"]*)\"$")
    public void i_choose_a_menu_option(String menu) throws Throwable {
        WebElement menuOption = driver.findElement(By.xpath("//span[text()='"+menu+"']"));
        mouseOver(menuOption);
    }

    @When("^I choose a submenu option \"([^\"]*)\"$")
    public void i_choose_a_submenu_option(String subMenu) throws Throwable {
        Thread.sleep(3000);
         driver.findElement(By.xpath("//a[text()='"+subMenu+"']")).click();
       
    }

    @Then("^I should be in the appropriate results page \"([^\"]*)\"$")
    public void i_should_be_in_the_appropriate_results_page(String resultsHeader) throws Throwable {
       WebElement element = driver.findElement(By.xpath("//div[@class='SearchedFor']/h1"));
       Assert.assertTrue(element.isDisplayed());
    }

}
