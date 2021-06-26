package Section13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello scrolling");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        //table[@id='product'] //tr/td[4]
        List<WebElement> rates = driver.findElements(By.xpath("//table[@id='product'] //tr/td[4]"));
        int sum =0;
        for(int i=0; i<rates.size(); i++)
        {
           sum = sum + Integer.parseInt(rates.get(i).getText());
        }
        System.out.println(sum);
        Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
    }
}
