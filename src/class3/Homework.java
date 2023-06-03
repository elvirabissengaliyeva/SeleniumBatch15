package class3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement textIn = driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        textIn.sendKeys("Hello!");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("sum1")).sendKeys("5");
        Thread.sleep(1000);
        WebElement sum2 = driver.findElement(By.xpath("//input[@id = 'sum2']"));
        sum2.sendKeys("7");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick = 'return total()']")).click();
        Thread.sleep(1000);
        WebElement totalValue = driver.findElement(By.xpath("//button[text() = 'Get Total']"));
        String buText = totalValue.getText();
        System.out.println(buText);
    }
}
