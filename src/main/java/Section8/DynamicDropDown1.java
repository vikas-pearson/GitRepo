package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello DynamicDropDown1");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(3000);
        // Selecting chennai using parent child relationship
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
    }
}
