import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserDriver {

    public static WebDriver initializeDriver(String Browser) {
        if (Browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\geckodriver.exe");
            return new FirefoxDriver();
        } else if (Browser.equalsIgnoreCase("chrome")) {
            System.setProperty("chromedriver", System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
            return new ChromeDriver();
        }else{
            return  null;
        }
    }

}
