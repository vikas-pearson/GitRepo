package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture115Pagination {
    public static void main(String[] args)
    {
        System.out.println("Hello Lecture115Pagination");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<String> price;
        do
        {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
            price = elementList.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
            if(price.size()<1)
            {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        }while (price.size()<1);

    }
    public static String getPrice(WebElement s)
    {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
