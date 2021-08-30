package com.midtrans.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties p1;
    public ReadConfig()
    {
        File src = new File("./configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            p1 = new Properties();
            p1.load(fis);

        }catch (Exception e)
        {
            System.out.println("Exception is "+ e.getMessage());
        }
    }
    public String getapplicationURl()
    {
        String url = p1.getProperty("baseurl");
        return url;
    }
    public String getchromepath()
    {
        String chromepath = p1.getProperty("chromepath");
        return chromepath;
    }
    public String getgeckodriverpath()
    {
        String firefoxpath = p1.getProperty("firefoxpath");
        return firefoxpath;
    }
    public String Shoppingcartname()
    {
        String getname = p1.getProperty("name");
        return getname;
    }
    public String ShoppingcartEmail()
    {
        String getemail = p1.getProperty("email");
        return getemail;
    }
    public String Shoppingcartphone()
    {
        String getphone = p1.getProperty("phone");
        return getphone;
    }
    public String Shoppingcartcity()
    {
        String getcity = p1.getProperty("city");
        return getcity;
    }
    public String Shoppingcartaddress()
    {
        String getaddress = p1.getProperty("address");
        return getaddress;
    }
    public String Shoppingcartpostal()
    {
        String getpostal = p1.getProperty("postal");
        return getpostal;
    }
    public String Cardnumber()
    {
        String getcardnumber = p1.getProperty("cardnumber");
        return getcardnumber;
    }
    public String Expirydate()
    {
        String getexpiry = p1.getProperty("expiry");
        return getexpiry;
    }
    public String cvvnumber()
    {
        String getcvv = p1.getProperty("cvv");
        return getcvv;
    }
    public String passwordtext()
    {
        String getpassword = p1.getProperty("validpassword");
        return getpassword;
    }
    public String passwordtext1()
    {
        String getinvalidpassword = p1.getProperty("Invalidpassword");
        return getinvalidpassword;
    }


}
