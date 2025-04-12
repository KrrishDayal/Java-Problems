package calculator;

public class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }
}
import calculator.BasicCalculator;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Divide: " + calc.divide(10, 2));
    }
}
