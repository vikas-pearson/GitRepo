package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Lecture84 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Lecture84");
        System.setProperty("webdriver.chrome.driver","C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        Iterator<String> it = allHandles.iterator();
        String window1 = it.next();
        String childWindow = null;
        if(parentWindow.equalsIgnoreCase(window1))
        {
            childWindow = it.next();
        }
        else
        {
            childWindow = window1;
        }
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        //System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
        String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector("#username")).sendKeys(email);
    }
}
