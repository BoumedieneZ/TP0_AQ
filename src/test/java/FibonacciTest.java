import org.example.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciBaseCases() {
        // Cas de base
        Assertions.assertEquals(0, Fibonacci.fibonacci(0));
        Assertions.assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciGeneralCases() {
        // Cas généraux
        Assertions.assertEquals(1, Fibonacci.fibonacci(2));
        Assertions.assertEquals(2, Fibonacci.fibonacci(3));
        Assertions.assertEquals(3, Fibonacci.fibonacci(4));
        Assertions.assertEquals(5, Fibonacci.fibonacci(5));
        Assertions.assertEquals(8, Fibonacci.fibonacci(6));
        Assertions.assertEquals(13, Fibonacci.fibonacci(7));
    }

    @Test
    public void testFibonacciNegativeInput() {
        // Cas d'erreur
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
        Assertions.assertEquals("n must be positive", thrown.getMessage());
    }
}
