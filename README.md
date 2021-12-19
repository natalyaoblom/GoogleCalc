# GoogleCalc
Требования.
1. На языке программирования Java или Python (версия на ваш выбор) создать проект UI
автотестов, разработать автотест по тест-кейсу ниже
2. В проекте использовать:
- Selenium Webdriver (желательно использовать браузер Chrome)
- один из тестовых фреймворков - TestNG, JUnit 4/5, Pytest
3. Результаты оформить в виде проекта на GitHub, ссылку на проект приложить в качестве
результата выполнения задания
4. В проекте желательно использовать паттерн проектирования Page Object Model
Задание. Описание тест-кейса:
Предусловие:
● Открыть браузер
Шаги:
● Открыть страницу http://google.com
● В поисковую строку ввести слово “Калькулятор”
● Нажать на кнопку поиска
● В открывшемся калькуляторе посчитать результат выражения: «1 * 2 - 3 + 1»
Ожидаемый результат:
● в строке памяти (строка над результатом) отображается ранее введенная формула «1 * 2 - 3 +
1 =»
● в строке результата отображается «0»
Постусловие:
● Закрыть браузер