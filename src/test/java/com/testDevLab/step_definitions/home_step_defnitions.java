package com.testDevLab.step_definitions;

import com.github.javafaker.HowIMetYourMother;
import com.testDevLab.pages.HomePage;
import com.testDevLab.utilities.ConfigReader;
import com.testDevLab.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class home_step_defnitions {

    HomePage homePage =new HomePage();
    Actions actions= new Actions(Driver.get());

    List<WebElement> elements = homePage.sections;
    List<WebElement> elements1 = homePage.subSections;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigReader.get("url");
        Driver.get().get(url);

    }
    @Then("User can not see sub-menu modules")
    public void user_can_not_see_menu_modules() {



        for (WebElement element : elements1) {
            Assert.assertFalse(element.isDisplayed());
        }

        }

    @Then("User can see sub-menu modules after hover over")
    public void user_can_not_see_sub_menu_modules() {

        for (WebElement element : elements) {
            actions.moveToElement(element).click().perform();
            for (WebElement webElement : elements1) {
                Assert.assertTrue(webElement.isEnabled());
            }
        }

    }

}
