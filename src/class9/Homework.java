package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement employeeBtn = driver.findElement(By.xpath("//a [@id='menu_pim_viewPimModule']"));
        employeeBtn.click();

        //        ------------------------



            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            boolean idfound=false;
            while (!idfound){

        for(int i=0;i<ids.size();i++) {
            String id = ids.get(i).getText();

            if (id.equalsIgnoreCase("52396A")) {

                System.out.println(i);

                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();

                idfound = true;
                break;
            }
        }
        if(!idfound) {

            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();
        }
            }
        }
    }
