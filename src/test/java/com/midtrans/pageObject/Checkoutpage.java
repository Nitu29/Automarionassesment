package com.midtrans.pageObject;

import com.midtrans.Testcases.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Checkoutpage {
    WebDriver ldriver;
    public Checkoutpage(WebDriver rdriver)
    {
        ldriver= rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//input[@value='Budi']")
    WebElement Nametextbox;
    @FindBy(xpath = "//input[@value='budi@utomo.com']")
    WebElement Emailtextbox;
    @FindBy(xpath = "//input[@value='081808466410']")
    WebElement Phonenotextbox;
    @FindBy(xpath = "//input[@value='Jakarta']")
    WebElement Citytext;
    @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
    WebElement Addresstext;
    @FindBy(xpath = "//input[@value='10220']")
    WebElement PostalCodetext;
    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement Checkoutbutton;
    @FindBy(xpath = "//*[@id=\"header\"]/div/span/p")
    WebElement frameelement;

    public String getthevalueenteredinNamefield()
    {
       String s1= Nametextbox.getAttribute("value");
       //System.out.println(s1);
        return s1;
    }
    public String getthevalueenteredinEmailfield()
    {
        String s1= Emailtextbox.getAttribute("value");
        //System.out.println(s1);
        return s1;
    }
    public String getthevalueenteredinPhonenofield()
    {
        String s1= Phonenotextbox.getAttribute("value");
        //System.out.println(s1);
        return s1;
    }
    public String getthevalueenteredincityfield()
    {
        String s1= Citytext.getAttribute("value");
        //System.out.println(s1);
        return s1;
    }
    public String getthevalueenteredinAddressfield()
    {
        String s1= Addresstext.getAttribute("value");
        //System.out.println(s1);
        return s1;
    }
    public String getthevalueenteredinpostalfield()
    {
        String s1= PostalCodetext.getAttribute("value");
        //System.out.println(s1);
        return s1;
    }
    public void clearthevaluefromtextfield()
    {
        Nametextbox.clear();
        Baseclass.holdExecutionForSeconds(2);
        Emailtextbox.clear();
        Baseclass.holdExecutionForSeconds(2);
        Phonenotextbox.clear();
        Baseclass.holdExecutionForSeconds(2);
        Citytext.clear();
        Baseclass.holdExecutionForSeconds(2);
        Addresstext.clear();
        Baseclass.holdExecutionForSeconds(2);
        PostalCodetext.clear();
        Baseclass.holdExecutionForSeconds(2);
    }
    public void sendthevalueintextfield()
    {
        Nametextbox.sendKeys("Test1");
        Baseclass.holdExecutionForSeconds(2);
        Emailtextbox.sendKeys("Test@gmail.com");
        Baseclass.holdExecutionForSeconds(2);
        Phonenotextbox.sendKeys("0112312");
        Baseclass.holdExecutionForSeconds(2);
        Citytext.sendKeys("Noida");
        Baseclass.holdExecutionForSeconds(2);
        Addresstext.sendKeys("Testforautomation Delhi Noida");
        Baseclass.holdExecutionForSeconds(2);
        PostalCodetext.sendKeys("100091");
        Baseclass.holdExecutionForSeconds(2);
    }
    public void clickoncheckoutbutton()
    {
        Checkoutbutton.click();


    }
}
