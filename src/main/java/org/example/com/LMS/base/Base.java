package org.example.com.LMS.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties properties = new Properties();

    public Base(){
        try{
            File file = new File("src/main/java/org/example/com/LMS/properities/config.properities");
            FileInputStream fis = new FileInputStream(file);
            properties.load(fis);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void lanuchBrowser()  {

        if(properties.get("browser").equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (properties.get("browser").equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else
            throw new Error("browser not supported");

        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

}
