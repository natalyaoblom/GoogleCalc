import config.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleCalc extends Configurations {
    /**
     * Шаги:
     * ● Открыть страницу http://google.com
     * ● В поисковую строку ввести слово “Калькулятор”
     * ● Нажать на кнопку поиска
     * ● В открывшемся калькуляторе посчитать результат выражения: «1 * 2 - 3 + 1»
     * Ожидаемый результат:
     * ● в строке памяти (строка над результатом) отображается ранее введенная формула «1 * 2 - 3 +
     * 1 =»
     * ● в строке результата отображается «0»
     * Постусловие:
     * ● Закрыть браузер
     */

    @Test
    public void calculateExpressions() {
        driver.findElement(By.xpath("//*[@title=\"Поиск\"]")).click();
        driver.findElement(By.xpath("//*[@title=\"Поиск\"]")).sendKeys("Калькулятор");
        driver.findElement(By.xpath("//*[@value=\"Поиск в Google\"]")).click();
        driver.findElement(By.xpath("//div[@role=\"button\"][text()='1']")).click(); //1
        driver.findElement(By.xpath("//div[@aria-label=\"умножение\"]")).click(); //*
        driver.findElement(By.xpath("//div[@role=\"button\"][text()='2']")).click(); //2
        driver.findElement(By.xpath("//div[@aria-label=\"вычитание\"]")).click(); //-
        driver.findElement(By.xpath("//div[@role=\"button\"][text()='3']")).click(); //3
        driver.findElement(By.xpath("//div[@aria-label=\"сложение\"]")).click(); //+
        driver.findElement(By.xpath("//div[@role=\"button\"][text()='1']")).click(); //1
        driver.findElement(By.xpath("//div[@aria-label=\"равно\"]")).click(); //=

        WebElement s = driver.findElement(By.xpath("//*[text()='1 × 2 - 3 + 1 =']"));
        Assert.assertTrue(s.isDisplayed());

        WebElement result = driver.findElement(By.xpath("//*[@id=\"cwos\"][text()='0']"));
        Assert.assertTrue(result.isDisplayed());
    }

}
