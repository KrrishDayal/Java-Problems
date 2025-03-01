import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 9, 4, 2,8,10};

        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
