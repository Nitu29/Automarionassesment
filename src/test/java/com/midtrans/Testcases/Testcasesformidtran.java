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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Testcasesformidtran extends Baseclass{

    @Test(priority = 1,groups= {"Regression", "Smoke"})
    public void verifybuynowbuttonfunctionality()
    {
        Homepage homepage = new Homepage(driver);
        homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
    }
    @Test(priority=2, groups = {"Regression"})
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
    @Test(priority = 3, groups = {"Regression"})
    public void verifyEmailtextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredinEmailfield();
        System.out.println(S1);
        Assert.assertEquals(S1,"budi@utomo.com");
        System.out.println("Assert is passed");
    }
    @Test(priority = 4, groups = {"Regression"})
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
    @Test(priority = 5, groups = {"Regression"})
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
    @Test(priority = 6, groups = {"Regression"})
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
    @Test(priority = 7, groups = {"Regression"})
    public void verifypostalcodetextfield()
    {
        Checkoutpage checkoutpage= new Checkoutpage(driver);
        //Homepage homepage= new Homepage(driver);
        //homepage.clickonBuynowbutton();
        Baseclass.holdExecutionForSeconds(2);
        String S1=checkoutpage.getthevalueenteredinpostalfield();
        System.out.println(S1);
        Assert.assertEquals(S1,"10220");
        System.out.println("Assert is passed");
    }
    @Test(priority = 8, groups = {"Regression"})
    public void verifythetextboxiseditable()
    {
        Checkoutpage checkoutpage = new Checkoutpage(driver);
        Baseclass.holdExecutionForSeconds(2);
        checkoutpage.clearthevaluefromtextfield();
        Baseclass.holdExecutionForSeconds(2);
        checkoutpage.sendthevalueintextfield();
    }

    //Verify clicking on Checkout button redirect user on Order Summary popup
    @Test(priority=9, groups = {"Regression", "Smoke"})
    public void verifycheckoutbuttonfunctionality()
    {
        Checkoutpage checkoutpage = new Checkoutpage(driver);
        Baseclass.holdExecutionForSeconds(2);
        checkoutpage.clickoncheckoutbutton();
        Baseclass.holdExecutionForSeconds(2);

        //By finding all the web elements using iframe tag
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
        System.out.println("Total number of iframes are " + ((List<?>) iframeElements).size());
        driver.switchTo().frame(0);
        String s1=driver.findElement(By.xpath("//span[@class=\"text-page-title\"]")).getText();
        System.out.println(s1);
        Assert.assertEquals(s1,"Order Summary");
        System.out.println("Asset is passed-: User navigated to Ordersummary page");
    }

    @Test(priority =10, groups = {"Regression"})
    public  void getproductdetailsonordersummarypage()
    {
        Ordersummary ordersummary = new Ordersummary(driver);
        String S1 = ordersummary.itemamount();
        System.out.println(S1);
        Assert.assertEquals(S1,"20,000");
        System.out.println("Assert is passed-: amount of item is 20,000");
        Baseclass.holdExecutionForSeconds(2);
        String S2= ordersummary.itemvalue();
        System.out.println(S2);
        Assert.assertEquals(S2,"Midtrans Pillow");
        System.out.println("Assert is passed-: item name is Midtrans Pillow");
    }
    @Test(priority=11, groups = {"Regression", "Smoke"})
    public void verifythefunctionaliyofcontinuebuttn()
    {
        Ordersummary ordersummary = new Ordersummary(driver);
        ordersummary.clickoncontinuebutton();
        Baseclass.holdExecutionForSeconds(5);
        String s1=driver.findElement(By.xpath("//span[@class='text-page-title']")).getText();
        System.out.println(s1);
        Assert.assertEquals(s1,"Select Payment");
        System.out.println("Assert is pased-: #User navigated to select payment page");
    }
    @Test(priority = 12, groups = {"Regression"})
    public void verifythedifferentpaymentvalueonselectpaymentpage()
    {
        Payment payment= new Payment(driver);
        List<WebElement> options= driver.findElements(By.xpath("//div[@class='list-content']"));
        System.out.println(options.size());
        List actualpaymentvalue= new ArrayList();
        for(WebElement wb1:options)
        {
            actualpaymentvalue.add(wb1.getText());
            System.out.println(wb1.getText());
        }
        List expectedpaymentvalue= new ArrayList();
        for(WebElement wb2:options)
        {
            expectedpaymentvalue.add(wb2.getText());
            System.out.println(wb2.getText());
        }
        for(int i = 0; i<actualpaymentvalue.size(); i++)
        {

            System.out.println("Actual: "+actualpaymentvalue.get(i)+ " \n " +" & Expected: "+ expectedpaymentvalue.get(i));
            Assert.assertTrue(actualpaymentvalue.get(i).equals(expectedpaymentvalue.get(i)));
            System.out.println("payment value is same as expected");

        }
    }
    @Test(priority = 13, groups = {"Regression", "Smoke"})
    public void clickoncreditdebitcardoption()
    {
        Payment payment= new Payment(driver);
        payment.clickoncredeitdebitcardoption();
        String s1= driver.findElement(By.xpath("//span[@class='text-page-title']")).getText();
        System.out.println(s1);
        Assert.assertEquals(s1,"Credit/Debit Card");
        System.out.println("Assert is passed-: User redirected to Card details screen");
    }
    @Test(priority = 14, groups = {"Regression"})
    public void validateamountafterapplyingcoupon()
    {
        Payment payment= new Payment(driver);
        Baseclass.holdExecutionForSeconds(2);
        payment.uncheckcoupon();
        Baseclass.holdExecutionForSeconds(5);
        String s1= driver.findElement(By.xpath("//div[@class='amount-content pull-right']")).getText();
        System.out.println("Amount before applying coupon code is: "+s1);
        payment.checkcuopncode();
        Baseclass.holdExecutionForSeconds(2);
        String s2= driver.findElement(By.xpath("//div[@class='amount-content pull-right']")).getText();
        System.out.println("Amount before applying coupon code is: "+s2);
        System.out.println("Amount without applying coupon is"+s1+"Amount after applying coupon is"+s2);
    }
    @Test(priority = 15, groups = {"Regression", "Smoke"})
    public void verifythedetailsavailableonbankpaymentpageandentercarddetails()
    {
        Payment payment= new Payment(driver);
        payment.entercarddetails();
        Baseclass.holdExecutionForSeconds(2);
    }
//    @Test(priority = 16, groups = {"Regression", "Smoke"})
//    public void verifythefuctionalitytoclickonokbuttonwithvalidpassword()
//    {
//        Payment payment= new Payment(driver);
//        payment.enterpasswordtext();
//        Baseclass.holdExecutionForSeconds(5);
//        payment.clickonokbutton();
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Thank you for your purchase.']")));
//        String S1= driver.findElement(By.xpath("//span[normalize-space()='Thank you for your purchase.']")).getText();
//        System.out.println(S1);
//        Assert.assertEquals(S1,"Thank you for your purchase.");
//        System.out.println("Assert is passed-: Order placed successfully");
//    }
    @Test(priority = 17, groups = {"Regression"})
    public void verifyclickingonokbuttonwithinvaidoutput()
    {
        Payment payment= new Payment(driver);
        payment.enterpasswordtext();
        Baseclass.holdExecutionForSeconds(2);
        payment.clickonokbutton();
        String s1= driver.findElement(By.xpath("//div[@class='text-failed']")).getText();
        System.out.println(s1);
        Assert.assertEquals(s1,"Transaction failed");
        System.out.println("Assert is passed-: Transaction failed");
    }
}
