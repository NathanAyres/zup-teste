package web.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadDriver {

    private static ThreadLocal<WebDriver> _driver = new ThreadLocal<WebDriver>();

    public synchronized static void setTDriver(WebDriver driver) {
        _driver.set(driver);
    }

    public synchronized static ChromeDriver getTDriver() {
        return (ChromeDriver) _driver.get();
    }
    
}
