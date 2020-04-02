package IdentifyUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IdentifyUrlTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("search_form_input_homepage")).sendKeys("lesson");
        driver.findElement(By.id("search_button_homepage")).click();
        driver.findElement(By.className("result__a")).click();
            System.out.println("Wrong URL Returned");

        }
    public static void main(String[] args) throws InterruptedException {
            IdentifyUrlTests test = new IdentifyUrlTests();
            test.setUp();
        }
    }

