import org.example.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {

    @Test
    public void testIsPrimeWithPrimes() {
        Assertions.assertTrue(Prime.isPrime(2));
        Assertions.assertTrue(Prime.isPrime(3));
        Assertions.assertTrue(Prime.isPrime(5));
        Assertions.assertTrue(Prime.isPrime(7));
        Assertions.assertTrue(Prime.isPrime(11));
        Assertions.assertTrue(Prime.isPrime(13));
        Assertions.assertTrue(Prime.isPrime(17));
        Assertions.assertTrue(Prime.isPrime(19));
        Assertions.assertTrue(Prime.isPrime(23));
    }

    @Test
    public void testIsPrimeWithNonPrimes() {
        Assertions.assertFalse(Prime.isPrime(0));
        Assertions.assertFalse(Prime.isPrime(1));
        Assertions.assertFalse(Prime.isPrime(4));
        Assertions.assertFalse(Prime.isPrime(6));
        Assertions.assertFalse(Prime.isPrime(8));
        Assertions.assertFalse(Prime.isPrime(9));
        Assertions.assertFalse(Prime.isPrime(10));
        Assertions.assertFalse(Prime.isPrime(12));
        Assertions.assertFalse(Prime.isPrime(14));
    }

    @Test
    public void testIsPrimeWithNegativeNumbers() {
        Assertions.assertFalse(Prime.isPrime(-1));
        Assertions.assertFalse(Prime.isPrime(-2));
        Assertions.assertFalse(Prime.isPrime(-3));
        Assertions.assertFalse(Prime.isPrime(-4));
        Assertions.assertFalse(Prime.isPrime(-5));
    }
}
