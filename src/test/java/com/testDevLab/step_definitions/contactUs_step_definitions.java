package com.testDevLab.step_definitions;

import com.testDevLab.pages.ContactUsPage;
import com.testDevLab.pages.HomePage;
import com.testDevLab.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class contactUs_step_definitions {
ContactUsPage contactUsPage =new ContactUsPage();
    HomePage homePage =new HomePage();
    Actions actions= new Actions(Driver.get());

    List<WebElement> elements = contactUsPage.warningMessage;
    List<WebElement> elements2 = contactUsPage.errorIcons;

    @When("User clicks on Contact us Button")
    public void user_clicks_on_contact_us_button() {

        contactUsPage.contactUs.click();


    }
    @When("User clicks on Send button")
    public void user_clicks_on_send_button() {
        contactUsPage.sendButton.click();


    }
    @Then("Verify that warning messages")
    public void verify_that_warning_messages() {

        int numberOfWarnings = elements.size();
        Assert.assertEquals(numberOfWarnings,5);
        for (WebElement element : elements) {
            Assert.assertEquals(element.getText(),"This field is required");
        }


    }
    @Then("Verify that error icons")
    public void verify_that_error_icons() {

        for (WebElement element : elements2) {
            Assert.assertTrue(element.isDisplayed());
        }


    }

}
