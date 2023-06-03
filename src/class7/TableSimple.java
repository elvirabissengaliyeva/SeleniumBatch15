package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
//       System.out.println(table_data);

        //        task2: row level access
//        get the rows of the table and print them
//        print the row that contains Company google
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//    print the rows
        for (WebElement row : Rows) {
//            extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")) {
//               System.out.println(row_text);
            }


            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
            for (WebElement column : columns) {
//                System.out.println(column.getText());

            }
        }
        List<WebElement> columns1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement column1 : columns1) {
            System.out.println(column1.getText());
        }

    }
}