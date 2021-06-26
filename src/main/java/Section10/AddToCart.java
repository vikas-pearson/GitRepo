package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCart {
    public static void main(String[] args)
    {
        System.out.println("Hello AddToCart");
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] itemsNeeded = {"Brocolli","Cucumber","Beetroot"};
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
        System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());

    }
    public static void addItems(WebDriver driver, String[] itemsNeeded)
    {
        List al = Arrays.asList(itemsNeeded);
        int j=0;
        // Taking all items in a List
        List<WebElement> listOfProducts = driver.findElements(By.cssSelector("h4[class='product-name']"));

        for(int i=0; i<listOfProducts.size(); i++)
        {
            String[] name = listOfProducts.get(i).getText().split("-");
            String formattedName = name[0].trim();
            if(al.contains(formattedName))
            {
                j++;
                driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
                if(j==al.size())
                {
                    break;
                }
            }
        }
    }
}
