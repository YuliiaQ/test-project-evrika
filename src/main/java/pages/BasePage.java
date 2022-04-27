package pages;

import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static java.lang.String.format;

public class BasePage {
    @Getter
    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static WebDriver getDriverThreadLocal() {
        return DRIVER_THREAD_LOCAL.get();
    }

    public static void setDriverThreadLocal(WebDriver webDriver) {
        DRIVER_THREAD_LOCAL.set(webDriver);
    }

    public WebElement waitForVisibilityOfElement(String locator) {
        return new WebDriverWait(getDriverThreadLocal(), 25).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public WebElement waitForVisibilityOfElementCss(String locator) {
        return new WebDriverWait(getDriverThreadLocal(), 30).
                until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public WebElement findElementByXPath(String xpath) {
        return waitForVisibilityOfElement(xpath);
    }

    public WebElement findElementByCss(String cssSelector) {
        return waitForVisibilityOfElementCss(cssSelector);
    }

    public List<WebElement> waitForVisibilityOfAllElements(String locator) {
        return new WebDriverWait(getDriverThreadLocal(), 30).
                until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public List<WebElement> findAllElementsByXPath(String xpath) {
        return waitForVisibilityOfAllElements(xpath);
    }

    public static String getCssElement(final WebElement element, String pseudoElt) {
        JavascriptExecutor js = (JavascriptExecutor) getDriverThreadLocal();
        return (String) js.executeScript(format("return window.getComputedStyle(arguments[0],'%s')",
                        pseudoElt, ":after"), element);
    }

    public static String captureScreen() {
        String path;
        try {
            WebDriver webDriver = new Augmenter().augment(getDriverThreadLocal());
            File source = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            path = "target/testScreenShots/" + source.getName();
            FileUtils.copyFile(source, new File(path));
        }
        catch(IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }
        return path;
    }
}
