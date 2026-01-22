import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciTest {
    @Test
    void generate_first10() {
        assertArrayEquals(
                new BigInteger[] {
                        BigInteger.ONE,
                        BigInteger.ONE,
                        BigInteger.valueOf(2),
                        BigInteger.valueOf(3),
                        BigInteger.valueOf(5),
                        BigInteger.valueOf(8),
                        BigInteger.valueOf(13),
                        BigInteger.valueOf(21),
                        BigInteger.valueOf(34),
                        BigInteger.valueOf(55)
                },
                Fibonacci.generate(10));
    }

    @Test
    void generate_zeroCount() {
        assertArrayEquals(new BigInteger[] {}, Fibonacci.generate(0));
    }
}
