package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WorkingWithLinks {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello WorkingWithLinks");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        // Gives the count of links on a page
        System.out.println(driver.findElements(By.tagName("a")).size());
        //Limiting the scope of the driver to only footer section
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        // Counting links in footer section
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        // FInd the links of first link of footer section
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        //Find if all the links in footer coloumn are working or not
        for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
        {
            String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
            Thread.sleep(5000);
        }

        // Get the title of each window
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.print(driver.getTitle());
        }

    }
}
