package com.midtrans.Testcases;

import com.midtrans.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Baseclass {

    ReadConfig readConfig = new ReadConfig();
    public String baseurl = readConfig.getapplicationURl();
    public WebDriver driver;

    public static void holdExecutionForSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setup(String br)
    {
        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getchromepath());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else if (br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", readConfig.getgeckodriverpath());
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(baseurl);
    }


//    @BeforeMethod
//    public void getbaseurl()
//    {
//        driver.get(baseurl);
//    }


    @AfterClass
    public void tearDown()
    {
        //driver.quit();
        this.driver.quit();
    }
}
