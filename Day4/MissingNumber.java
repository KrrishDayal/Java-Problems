public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Missing number: 3
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;  // Sum of first N natural numbers
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        System.out.println("Missing Number: " + (totalSum - arrSum));
    }
}
