package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Configurations {
    public static String driverType = "webdriver.chrome.driver";
    public static String driverPath = "src\\test\\resources\\chromedriver.exe";
    public static String testURL = "https://www.google.com/";
    public static WebDriver driver;

    @BeforeTest
    public void prepareDriver() {
        //определение пути до драйвера и его настройка
        System.setProperty(driverType, driverPath);
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(testURL);
    }

    @AfterTest
    public void quitDriver() {
        driver.close();
    }


}
