import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        
        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + (isArmstrong(num) ? " is" : " is not") + " an Armstrong number.");
        scanner.close();
    }
}
