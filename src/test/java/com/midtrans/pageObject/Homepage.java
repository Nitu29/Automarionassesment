package com.midtrans.pageObject;

import com.midtrans.Testcases.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
    WebDriver driver;
    public Homepage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement Buynowbutton;

    public void clickonBuynowbutton()
    {
        Baseclass.holdExecutionForSeconds(5);
        Buynowbutton.click();
    }
}
