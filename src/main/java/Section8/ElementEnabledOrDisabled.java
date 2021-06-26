package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabledOrDisabled {
    public static void main(String[] args)
    {
        System.out.println("Hello ElementEnabledOrDisabled");
        System.setProperty("webdriver.chrome.driver","C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        String style = driver.findElement(By.cssSelector("div#Div1")).getAttribute("style");
        //System.out.println(style);
        if(style.contains("0.5"))
        {
            System.out.println("Disabled");
        }
        else
        {
            System.out.println("Enabled");
        }

    }
}
