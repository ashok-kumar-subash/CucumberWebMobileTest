package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BasePage{

    public SearchResult(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//g-section-with-header//h3[text()='Searches related to test']")
    private static WebElement txtRelateddSearch;

    @FindBy(linkText="Speedtest by Ookla - The Global Broadband Speed Test")
    private static WebElement lnkSpeedTest;

    @FindBy(id="resultStats")
    private static WebElement txtResultStats;



    @Override
    public boolean verifyPage() {
        waitUntilElementVisible(txtResultStats);
        return txtResultStats.isDisplayed();
    }

    public boolean verifyResultLink(){
        if (lnkSpeedTest.isDisplayed()){
            return true;
        }else{
            return false;
        }
    }


}
