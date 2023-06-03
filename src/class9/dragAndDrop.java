package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class dragAndDrop {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // Not exe for Mac

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));

        WebElement droppable = driver.findElement(By.id("droppable"));

        // action class
        Actions action= new Actions(driver);

        action.dragAndDrop(draggable,droppable).perform();






    }
}