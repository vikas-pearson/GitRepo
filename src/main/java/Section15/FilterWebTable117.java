package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWebTable117 {
    public static void main(String[] args)
    {
        System.out.println("Hello FilterWebTable117");
        System.setProperty("webdriver.chrome.driver","C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
        if(veggies.size() == filteredList.size())
        {
            System.out.println("Pass");
        }
    }
}