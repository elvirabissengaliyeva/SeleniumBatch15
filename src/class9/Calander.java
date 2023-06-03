package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calander {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-calendar-cont']"));

        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean isFound=false;

        while(!isFound){

            String month_ = month.getText();
            if(month_.equalsIgnoreCase("January")){
                List <WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String dayText=day.getText();
                    if(dayText.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }else {
                next.click();
            }
        }
    }
}
