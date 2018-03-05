package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public abstract boolean verifyPage();

    public String getPageTitle(){
        return driver.getTitle();
    }

    public  void waitUntilElementVisible(WebElement element,int timeout){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
}

    public void waitUntilElementVisible(WebElement element){
        waitUntilElementVisible(element,10);
    }

    public static void enterText(WebElement element,String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }
}
