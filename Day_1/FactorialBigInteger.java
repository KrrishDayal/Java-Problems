import java.math.BigInteger;

public class FactorialBigInteger {
    public static void main(String[] args) {
        int num = 50; // Large number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    } 
}
