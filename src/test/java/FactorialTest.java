import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorialWithPositiveNumbers() {
        // Cas où le nombre est positif
        Assertions.assertEquals(1, Factorial.factorial(0)); // 0! = 1
        Assertions.assertEquals(1, Factorial.factorial(1)); // 1! = 1
        Assertions.assertEquals(2, Factorial.factorial(2)); // 2! = 2
        Assertions.assertEquals(6, Factorial.factorial(3)); // 3! = 6
        Assertions.assertEquals(24, Factorial.factorial(4)); // 4! = 24
        Assertions.assertEquals(120, Factorial.factorial(5)); // 5! = 120
        Assertions.assertEquals(720, Factorial.factorial(6)); // 6! = 720
        Assertions.assertEquals(5040, Factorial.factorial(7)); // 7! = 5040
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        // Cas où le nombre est négatif
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
    }
}
