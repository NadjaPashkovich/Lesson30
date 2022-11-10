import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver ChromeDriver= new ChromeDriver();

//        driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
//        driver = new SafariDriver();
//        driver = new InternetExplorerDriver();
        runTest(driver);
        runTest(ChromeDriver);

    }
    public static void runTest(WebDriver driver) throws InterruptedException{
        driver.get("https://www.google.com/");
//        driver.navigate().to("https://www.google.com/");

        TimeUnit.SECONDS.sleep(5);

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");

        element.submit();

        TimeUnit.SECONDS.sleep(5);
        System.out.println(driver.getTitle());

        driver.quit();
//        driver.close();
    }
}
