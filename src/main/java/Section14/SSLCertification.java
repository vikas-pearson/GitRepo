package Section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {
    public static void main(String[] args)
    {
        System.out.println("Hello SSLCertification");
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

        ChromeOptions c = new ChromeOptions();
        //c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\DriveA\\Java exe(New Laptop)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(c);


    }
}
