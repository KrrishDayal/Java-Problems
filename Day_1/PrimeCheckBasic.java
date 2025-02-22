public class PrimeCheckBasic {
    public static void main(String[] args) {
        int num = 29;
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i < n; i++) { // Check divisibility
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true;
    }
}
