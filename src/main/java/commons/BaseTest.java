package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    protected WebDriver getBrowserDriver(String browserName, String url) {
        String downloadFiles = GlobalConstants.PROJECT_PATH + File.separator + "src"
                + File.separator + "main"
                + File.separator + "resources"
                + File.separator + "downloadFiles";
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case HCHROME:
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless"); // Chạy không giao diện
//                options.addArguments("--disable-gpu"); // Hữu ích cho môi trường Windows
//                options.addArguments("--window-size=1920,1080"); // Tùy chọn nhưng nên có

                options.addArguments("--disable-notifications");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                options.addArguments("--disable-infobars");
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("credentials_enable_service", false);  // Tắt trình quản lý mật khẩu
                prefs.put("profile.password_manager_enabled", false);  // Tắt popup lưu mật khẩu
                prefs.put("download.default_directory", downloadFiles);
                prefs.put("download.prompt_for_download", false);
                prefs.put("safebrowsing.enabled", true);
                options.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("browser is invalid");
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT));
        driver.manage().window().maximize();
        return driver;
    }
}
