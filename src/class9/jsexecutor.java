package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class jsexecutor {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // Not exe for Mac

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username=driver.findElement (By.id("txtUsername"));
        username.sendKeys("Admin");

        //        to highlight the username box

//        1. declare isntance
        JavascriptExecutor js=(JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
        js.executeScript("arguments[0].style.border='5px dotted blue'",username);


        WebElement loginBtn=driver.findElement (By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0].click();",loginBtn);


    }
}