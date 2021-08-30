package com.midtrans.pageObject;

import com.midtrans.Testcases.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    WebDriver driver;
    public Payment(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='list-content']")
    WebElement paymentoptions;
    @FindBy(xpath = "//span[@class='text-page-title']")
    WebElement creditdebitcard;
    @FindBy(xpath = "//label[contains(text(),'Potongan 10% - Demo Promo Engine')]")
    WebElement uncheckcouponbutton;
    @FindBy(xpath = "//label[contains(text(),'Potongan 10% - Demo Promo Engine')]")
    WebElement checkcouponbutton;
    @FindBy(xpath = "//input[@name= 'cardnumber']")
    WebElement cardnumber;
    @FindBy(xpath = "//input[@placeholder= 'MM / YY']")
    WebElement Expirydate;
    @FindBy(xpath = "//input[@placeholder= '123']")
    WebElement cvvvalue;
    @FindBy(xpath= "//a[@class='button-main-content']")
    WebElement paynowbutton;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordtext;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-success']")
    WebElement okbutton;

    public void clickoncredeitdebitcardoption()
    {
        paymentoptions.click();
    }

    public void uncheckcoupon()
    {
        uncheckcouponbutton.click();
    }
    public void checkcuopncode()
    {
        checkcouponbutton.click();
    }
//    public void handelscrolbar()
//    {
//        JavascriptExecutor js = (JavascriptExecutor)dr;
//        js.executeScript("window.scrollBy(0,70)");            //Scroll Down(+ve)
//        Thread.sleep(3000);
//        System.out.println("Scrolled down..");
//
//        js.executeScript("window.scrollBy(0,-50)");           //Scroll Up (-ve)
//        Thread.sleep(3000);
//        System.out.println("Scrolled up..");
//    }
    public void entercarddetails()
    {
        cardnumber.sendKeys("4811 1111 1111 1114");
        Baseclass.holdExecutionForSeconds(5);
        Expirydate.sendKeys("0222");
        Baseclass.holdExecutionForSeconds(5);
        cvvvalue.sendKeys("123");
        Baseclass.holdExecutionForSeconds(5);
        paynowbutton.click();
        Baseclass.holdExecutionForSeconds(5);
        driver.switchTo().frame(0);
    }
    public void enterpasswordtext()
    {
        passwordtext.click();
        Baseclass.holdExecutionForSeconds(5);
        passwordtext.sendKeys("112233");
        Baseclass.holdExecutionForSeconds(5);
    }
    public void clickonokbutton()
    {
        okbutton.click();
        Baseclass.holdExecutionForSeconds(10);
    }


}
