package com.midtrans.pageObject;

import com.midtrans.Testcases.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordersummary {
    WebDriver ldriver;
    public Ordersummary(WebDriver rdriver)
    {
        ldriver= rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//span[@class='text-amount-amount']")
    WebElement orderamount;
    @FindBy(xpath = "//span[@class='item-name']")
    WebElement itemname;
    @FindBy(xpath = "//a[@class='button-main-content']")
    WebElement continuebutton;

    public String itemamount()
    {
        String S1= orderamount.getText();
        return S1;
    }
    public String itemvalue()
    {
        String S1= itemname.getText();
        return S1;
    }
    public void clickoncontinuebutton()
    {
        continuebutton.click();
    }

}
