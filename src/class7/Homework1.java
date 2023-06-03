package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Selenium Webdriver']")));

        WebElement text = driver.findElement(By.xpath("//h4[text()='Selenium Webdriver']"));
        String SeleniumWebdriver = text.getText();
        System.out.println(SeleniumWebdriver);


        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, 20);





        driver.findElement(By.xpath("//button[@id='checkbox']")).click();

        WebDriverWait wait3 = new WebDriverWait(driver, 20);

    }
}