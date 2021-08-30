package com.midtrans.Testcases;

import com.midtrans.pageObject.Checkoutpage;
import com.midtrans.pageObject.Homepage;
import com.midtrans.pageObject.Ordersummary;
import com.midtrans.pageObject.Payment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Testcasesformidtran extends Baseclass{
    @Test(priority = 1)
    public void verifybuynowbuttonfunctionality()
    {
        Homepage homepage = new Homepage(driver);
        homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
    }
    @Test(priority=2)
    public void verifynametextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        Baseclass.holdExecutionForSeconds(2);
        String S1= checkoutpage.getthevalueenteredinNamefield();
        System.out.println(S1);
        Assert.assertEquals(S1,"Budi");
        System.out.println("Assert is passed");
        Baseclass.holdExecutionForSeconds(2);
    }
    @Test(priority = 3)
    public void verifyEmailtextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredinEmailfield();
        System.out.println(S1);
        Assert.assertEquals(S1,"budi@utomo.com");
        System.out.println("Assert is passed");
    }
    @Test(priority = 4)
    public void verifyphonenotextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        //Homepage homepage= new Homepage(driver);
        //homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredinPhonenofield();
        System.out.println(S1);
        Assert.assertEquals(S1,"081808466410");
        System.out.println("Assert is passed");
    }
    @Test(priority = 5)
    public void verifycitytextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        //Homepage homepage= new Homepage(driver);
        //homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredincityfield();
        System.out.println(S1);
        Assert.assertEquals(S1,"Jakarta");
        System.out.println("Assert is passed");
    }
    @Test(priority = 6)
    public void verifyaddresstextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        //Homepage homepage= new Homepage(driver);
        //homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredinAddressfield();
        System.out.println(S1);
        Assert.assertEquals(S1,"MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11");
        System.out.println("Assert is passed");
    }
}
