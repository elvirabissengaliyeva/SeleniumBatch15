package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("elvira.bissengaliyeva@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("Bi$$ene3038134@");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }
}
