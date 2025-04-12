package mathops;

public class SimpleMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int square(int a) {
        return a * a;
    }
}
import mathops.SimpleMath;

public class Main {
    public static void main(String[] args) {
        SimpleMath math = new SimpleMath();

        System.out.println("5 + 3 = " + math.add(5, 3));
        System.out.println("10 - 7 = " + math.subtract(10, 7));
        System.out.println("Square of 6 = " + math.square(6));
    }
}
