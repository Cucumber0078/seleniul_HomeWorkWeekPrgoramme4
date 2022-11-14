package BroswerTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBroswerTest {
        static String browser = "chrome";
        static String baseUrl = "https://www.saucedemo.com/";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.firefox.driver", "drivers/Firefoxdriver.exe");
                System.setProperty("webdriver.Edge.driver", "drivers/Edgedriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge"))
            {
                driver = new EdgeDriver();
            }
            else {
                System.out.println("Wrong Browser Name");
            }
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            // find the email field element
            WebElement emailField = driver.findElement(By.id("user-name"));
            emailField.sendKeys("ssadfsdfsdf@gmail.com");
            WebElement passwordFiled = driver.findElement(By.name("password"));
            passwordFiled.sendKeys("sjdfkasjdf");

        }


    }



