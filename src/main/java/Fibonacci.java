import java.math.BigInteger;

public class Fibonacci {
    static BigInteger[] generate(int count) {
        return generate(count, BigInteger.ONE);
    }

    static BigInteger[] generate(int count, BigInteger startValue) {
        BigInteger[] out = new BigInteger[count];

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        while (a.compareTo(startValue) < 0) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        for (int i = 0; i < count; i++) {
            out[i] = a;
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        return out;
    }

    public static void main(String[] args) {
        int count = 100;
        if (args.length > 0) {
            count = Integer.parseInt(args[0]);
        }

        BigInteger startValue = BigInteger.ONE;
        if (args.length > 1) {
            startValue = new BigInteger(args[1]);
        }

        BigInteger[] seq = generate(count, startValue);
        for (BigInteger n : seq) {
            System.out.println(n);
        }
    }
}
