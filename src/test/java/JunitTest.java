import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class JunitTest {
    private WebDriver driver ;
    @Before
    public void setup(){

        driver = BrowserDriver.initializeDriver(System.getProperty("browserName"));
    }
    @Test
    public void testGoogleSearch()
    {
        driver.get("http://google.com");
        Assert.assertEquals( "Google",driver.getTitle());
        SearchPage searchPage=new SearchPage(driver);
        Assert.assertTrue(searchPage.verifyPage());
        searchPage.serchGoogle("Test");
        SearchResult searchResult=new SearchResult(driver);
        Assert.assertTrue(searchResult.verifyPage());
        Assert.assertTrue(searchResult.verifyResultLink());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
