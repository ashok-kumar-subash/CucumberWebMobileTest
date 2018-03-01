import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class JunitTest {
    private WebDriver driver ;
    @Test
    public void testBrowser()
    {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://google.com");
        Assert.assertEquals( "Google",driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
