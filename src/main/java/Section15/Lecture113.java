package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture113 {
    public static void main(String[] args)
    {
        System.out.println("Hello Lecture113");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //Click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //Capture all the WebElement into list
        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
        // Capture text of all webelements into list(original list)
        List<String> originalList = items.stream().map(s->s.getText()).collect(Collectors.toList());
        //Sort the original list to sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        // Compare original list and sorted list
        System.out.println(originalList.equals(sortedList));

    }
}
