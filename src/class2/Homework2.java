package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("firstname")).sendKeys("Tester");
       driver.findElement(By.name("lastname")).sendKeys("Tester");
        driver.findElement(By.name("reg_email__")).sendKeys("Tester.Tester");
        driver.findElement(By.name("reg_passwd__")).sendKeys("111111111");
        driver.findElement(By.id("month")).sendKeys("14");
        driver.findElement(By.id("day")).sendKeys("Feb");
        driver.findElement(By.id("year")).sendKeys("1989");

        driver.findElement(By.id("u_2_4_7O")).click();

        driver.findElement(By.linkText("Sign Up")).click();

        driver.quit();

    }
}
