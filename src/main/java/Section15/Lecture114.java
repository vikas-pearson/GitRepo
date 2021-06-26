package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture114 {
    public static void main(String[] args)
    {
        System.out.println("Hello Lecture114");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //Click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //Capture all the WebElement into list
        List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> price = items.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
        price.forEach(s->System.out.println(s));
    }
    public static String getPrice(WebElement s)
    {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
