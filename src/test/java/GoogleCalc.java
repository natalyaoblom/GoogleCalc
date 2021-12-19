import config.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalcPage;

import java.util.Arrays;
import java.util.List;

public class GoogleCalc extends CalcPage {
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
        search("Калькулятор");

        List<Character> expression = Arrays.asList('1','×','2','-','3','+','1','=');
        pressKeys(expression);

        WebElement s = driver.findElement(By.xpath("//*[text()='1 × 2 - 3 + 1 =']"));
        Assert.assertTrue(s.isDisplayed());

        WebElement result = driver.findElement(By.xpath("//*[@id=\"cwos\"][text()='0']"));
        Assert.assertTrue(result.isDisplayed());
    }
}
