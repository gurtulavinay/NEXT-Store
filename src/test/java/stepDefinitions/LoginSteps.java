package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonFunctions;

public class LoginSteps extends CommonFunctions {
    @When("^I click on my account link$")
    public void i_click_on_my_account_link() throws Throwable {
       driver.findElement(By.xpath("/html/body/header/div[2]/section/section[2]/ul/li[1]/a")).click();
    }

    @When("^I enter Email address or Customer number \"(.*?)\"$")
    public void i_enter_Email_address_or_Customer_number(String username) throws Throwable {
       driver.findElement(By.id("EmailOrAccountNumber")).sendKeys(username);
    }

    @When("^I enter password \"(.*?)\"$")
    public void i_enter_password(String password) throws Throwable {
       driver.findElement(By.name("Password")).sendKeys(password);
    }

    @When("^I click on sign In button$")
    public void i_click_on_sign_In_button() throws Throwable {
       driver.findElement(By.name("SignInNow")).click();
    }

    @Then("^I should able to login successfully$")
    public void i_should_able_to_login_successfully() throws Throwable {
        WebElement elementInLoginPage = driver.findElement(By.id("btnlogout"));
        Assert.assertTrue(elementInLoginPage.isDisplayed());
    }
}
