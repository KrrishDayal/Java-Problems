import java.util.Scanner;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println(str + (isPalindrome(str) ? " is" : " is not") + " a palindrome.");
        scanner.close();
    }
}
