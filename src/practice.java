
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

        public static void main(String[] args) {
            // Set the path to the chromedriver executable
            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to the login page
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

            // Enter the username and password and click on the login button
            WebElement usernameInput = driver.findElement(By.id("txtUsername"));
            WebElement passwordInput = driver.findElement(By.id("txtPassword"));
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            usernameInput.sendKeys("Admin");
            passwordInput.sendKeys("Hum@nhrm123.");
            loginButton.click();

            // Navigate to the Qualifications section
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement qualificationsLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_Qualifications")));
            qualificationsLink.click();

            WebElement languageOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_viewLanguages")));
            languageOption.click();

            // Add a new language

            WebElement addLanguageButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
            addLanguageButton.click();

            WebElement languageNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("language_name")));
            WebElement languageCodeInput = driver.findElement(By.id("language_code"));

            WebElement saveLanguageButton = driver.findElement(By.id("btnSave"));

            languageNameInput.sendKeys("Spanish");
            languageCodeInput.sendKeys("es");
            saveLanguageButton.click();

            // Verify that the new language has been added successfully
            WebElement newLanguage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(), 'Spanish')]")));
            assert newLanguage != null;

            // Close the browser
            driver.quit();
        }
    }

