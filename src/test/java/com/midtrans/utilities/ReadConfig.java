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
}
