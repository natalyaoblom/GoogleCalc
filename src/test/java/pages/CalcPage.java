package pages;

import config.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalcPage extends Configurations {

    private WebElement searchField() {
        return driver.findElement(By.xpath("//*[@title=\"Поиск\"]"));
    }


    private WebElement searchInGoogle() {
        return driver.findElement(By.xpath("//*[@value=\"Поиск в Google\"]"));
    }

    private WebElement zero() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='0']"));
    }

    private WebElement one() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='1']"));
    }

    private WebElement two() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='2']"));
    }

    private WebElement three() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='3']"));
    }

    private WebElement four() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='4']"));
    }

    private WebElement five() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='5']"));
    }

    private WebElement six() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='6']"));
    }

    private WebElement seven() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='7']"));
    }

    private WebElement eight() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='8']"));
    }

    private WebElement nine() {
        return driver.findElement(By.xpath("//div[@role=\"button\"][text()='9']"));
    }

    private WebElement addition() {
        return driver.findElement(By.xpath("//div[@aria-label=\"сложение\"]"));
    } // +

    private WebElement subtraction() {
        return driver.findElement(By.xpath("//div[@aria-label=\"вычитание\"]"));
    } // -

    private WebElement division() {
        return driver.findElement(By.xpath("//div[@aria-label=\"деление\"]"));
    } // /

    private WebElement multiplication() {
        return driver.findElement(By.xpath("//div[@aria-label=\"умножение\"]"));
    } // ×

    private WebElement equals() {
        return driver.findElement(By.xpath("//div[@aria-label=\"равно\"]"));
    } // =

    public void pressKeys(List<Character> list) {


        for (char c : list) {
            switch (c) {
                case '0':
                    zero().click();
                    continue;
                case '1':
                    one().click();
                    continue;
                case '2':
                    two().click();
                    continue;
                case '3':
                    three().click();
                    continue;
                case '4':
                    four().click();
                    continue;
                case '5':
                    five().click();
                    continue;
                case '6':
                    six().click();
                    continue;
                case '7':
                    seven().click();
                    continue;
                case '8':
                    eight().click();
                    continue;
                case '9':
                    nine().click();
                    continue;
                case '+':
                    addition().click();
                    continue;
                case '-':
                    subtraction().click();
                    continue;
                case '/':
                    division().click();
                    continue;
                case '×':
                    multiplication().click();
                    continue;
                case '=':
                    equals().click();
                    break;
            }
        }
    }

    public void search(String word) {
        searchField().sendKeys(word);

        try {
            //Нажимаем "Не сейчас" во всплывающем окне "Находите названия животных..."
            driver.findElement(By.xpath("//g-flat-button")).click();
            driver.wait(100);
        } catch (Exception ignored) {

        } finally {

            searchField().click();
            searchInGoogle().click();
        }
    }

}
