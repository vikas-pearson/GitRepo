import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
Link for creating testng.xml - https://www.youtube.com/watch?v=KcDhx0e2wns
Link for content inside testng.xml - https://www.toolsqa.com/testng/testng-test-suite/
 */
public class HelloWorld {
    @Test
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
        System.out.println("Hello World4");
        System.out.println("Hello World5");
        System.out.println("Hello World6");
        System.out.println("Hello World7");

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google", "Google");
    }
    @Test
    public void test1()
    {
        System.out.println("Hello TestNG");
        Assert.assertEquals("Google", "Google");
    }

    @Test
    public void test2()
    {
        System.out.println("Hello TestNG");
        Assert.assertEquals("Google", "Google");
    }
}
