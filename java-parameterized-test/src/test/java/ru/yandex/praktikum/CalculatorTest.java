package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest { // создали тестовый класс
    private final int firstNumber;
    private final int secondNumber;
    private final int expected; // создали поля тестового класса

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected; // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { 2, 1, 2},
                { 2, 2, 4},
                { 1, 0, 0},
                { 0, 0, 0},
                { -1, 0, 0},
                { -1, 2, -2}
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }

    @Test
    public void shouldSumPositive() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void shouldSumPositiveAndZero() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void shouldBeMultiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.mult(firstNumber, secondNumber); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }
}
