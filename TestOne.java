// Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
// переданное число четным или нечетным:
// public boolean evenOddNumber(int n) {
// if (n % 2 == 0) {
// return true;
// } else {
// return false;
// }
// }

// Решение (возможны проблемы хех)

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, -2, -4, -6, -8, -10})
    public void testEvenNumbers(int number) {
        Number numberClass = new Number();
        assertTrue(numberClass.evenOddNumber(number), "Expected true for even number: " + number);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, -1, -3, -5, -7, -9})
    public void testOddNumbers(int number) {
        Number numberClass = new Number();
        assertFalse(numberClass.evenOddNumber(number), "Expected false for odd number: " + number);
    }
}
