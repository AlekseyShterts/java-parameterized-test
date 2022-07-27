package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeServiceTest { // создали тестовый класс
    private final String checkedText ;
    private final boolean expected;

    public PalindromeServiceTest(String checkedText, boolean expected) {
        this.checkedText  = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            {"asddsa", true},
            {"asddsaa", false}
        };
    }

    @Test
    public void shouldCheckPalindrome() {
        PalindromeService PalindromeService = new PalindromeService();
        boolean actual = PalindromeService.isPalindrome(checkedText);
        assertEquals(actual, expected);
    }
}