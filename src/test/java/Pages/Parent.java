package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void MyClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();}

    public void MySendKeys(WebElement element, String write) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(write);
        } catch (Exception e) {
            MySendKeysWithJS(element, write);}
    }

    public void MySendKeysWithJS(WebElement element, String write) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        try {
            js.executeScript("arguments[0].removeAttribute('readonly');", element);
            js.executeScript("arguments[0].removeAttribute('disabled');", element);
            js.executeScript("arguments[0].value='" + write + "';", element);
        } catch (Exception e) {
            e.printStackTrace();}
    }

    public void MyClickWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        try {
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

