package class5;

/*goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));


//        for each
//        for(WebElement checkbox :checkBoxes){
//            String value = checkbox.getAttribute("value");
//            if(value.equalsIgnoreCase("Option-2")){
//                checkbox.click();
//            }
//        }
//    }

//iterate through the list
        for (int i=0;i<checkBoxes.size();i++){

            String value = checkBoxes.get(i).getAttribute("value");
//                check if this is the desired one
//                if yes click it
//                if no continue to iterate
            if(value.equalsIgnoreCase("Option-2")){
                checkBoxes.get(i).click();
            }

        }

    }
}

