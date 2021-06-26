package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkingWithCalendar {
    public static void main(String[] args)
    {
        System.out.println("Hello WorkingWithCalendar");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[id='travel_date']")).click();

        //Selecting Month
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
        }

        //Selecting the date 23
        List<WebElement> dates = driver.findElements(By.className("day"));
        //System.out.println(dates);
        int count = dates.size();
        for(int i=0;i<count;i++)
        {
            String text = driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("23"))
            {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }

    }
}
