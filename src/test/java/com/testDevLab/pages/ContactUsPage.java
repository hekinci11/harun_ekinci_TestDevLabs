package com.testDevLab.pages;

import com.testDevLab.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[.='Send']")
    public WebElement sendButton;

    @FindBy(xpath = "//form//*[contains(@class,'field-error')]")
    public List<WebElement> warningMessage;

    @FindBy(xpath = "//form//div[contains(@class,'invalid')]//*[contains(@class,'error-icn')]")
    public List<WebElement> errorIcons;

    @FindBy(xpath = "(//a[@href='/contact-us'][@class='contact-us-btn cut-text'])[1]")
    public WebElement contactUs;


}
