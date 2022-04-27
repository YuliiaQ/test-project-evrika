package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@Getter
public class DriverInit {

    @Getter
    private WebDriver driver;

    public WebDriver setDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://evrika.wezom.agency/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return driver;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

//    @Parameters({"browser"})
//    @BeforeClass
//    public void setDriver(String browser) {//throws MalformedURLException{
//        if(browser.equalsIgnoreCase("firefox")){
//            driver = new FirefoxDriver();
//        }
//        if(browser.equalsIgnoreCase("chrome")){
//            File file = new File("F:\\chromedriver_win_22_0_1203_0b\\chromedriver.exe");//v22
//            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//            driver = new ChromeDriver();
//        }
//
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("URLOfSite");
//    }
}
