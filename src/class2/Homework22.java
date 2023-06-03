package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework22 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Kurt");
        driver.findElement(By.name("lastname")).sendKeys("Boz");
        driver.findElement(By.name("reg_email")).sendKeys("BozKurt@gmail.com");
        driver.findElement(By.name("reg_email_confirmation")).sendKeys("BozKurt@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("122333");
        driver.findElement(By.id("day")).sendKeys("1");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("year")).sendKeys("1999");
        driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();

        driver.findElement(By.className("_6j")).click();
        Thread.sleep(5000);

        driver.close();

    }
}
