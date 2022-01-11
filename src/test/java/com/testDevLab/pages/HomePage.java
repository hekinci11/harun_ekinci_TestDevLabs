package com.testDevLab.pages;


import com.testDevLab.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//*[@class='sections']/div")
    public List<WebElement> sections;

    @FindBy(xpath = "//*[@class='sections']//a[contains(@hrf,'')]")
    public List<WebElement> subSections;



    }

