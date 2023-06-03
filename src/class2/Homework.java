package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");

        driver.findElement(By.id("customer.firstName")).sendKeys("Elvira");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sat");
        driver.findElement(By.id("customer.address.street")).sendKeys("South Berendo Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("90020");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("13232222222");
        driver.findElement(By.id("customer.ssn")).sendKeys("1547876543");
        driver.findElement(By.id("customer.username")).sendKeys("Tester");
        driver.findElement(By.id("customer.password")).sendKeys("test");
        driver.findElement(By.id("repeatedPassword")).sendKeys("test");
        driver.findElement(By.className("button")).click();



        driver.quit();



    }
}
