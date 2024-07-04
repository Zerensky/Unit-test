// Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
// переданное число в интервал (25;100)
// public boolean numberInInterval(int n) { … } 


// Тесты для метода

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = {26, 50, 75, 99})
    public void testNumberInInterval(int number) {
        Number numberClass = new Number();
        assertTrue(numberClass.numberInInterval(number), "Expected true for number in interval (25, 100): " + number);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100, 0, -1, 101, Integer.MIN_VALUE, Integer.MAX_VALUE})
    public void testNumberNotInInterval(int number) {
        Number numberClass = new Number();
        assertFalse(numberClass.numberInInterval(number), "Expected false for number not in interval (25, 100): " + number);
    }
}

