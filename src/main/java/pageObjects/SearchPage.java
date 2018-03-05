package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="hplogo")
    private static WebElement imgLogo;

    @FindBy(id="lst-ib")
    private static WebElement txtSearch;

    @FindBy(name="btnK")
    private static WebElement btnSearch;

    @FindBy(name="btnI")
    private static WebElement btnFeelingLucky;

    @Override
    public boolean verifyPage() {
        waitUntilElementVisible(imgLogo);
        return imgLogo.isDisplayed();
    }

    public void serchGoogle(String searchText){
        waitUntilElementVisible(txtSearch);
        enterText(txtSearch,searchText);
        btnSearch.click();
    }





}
