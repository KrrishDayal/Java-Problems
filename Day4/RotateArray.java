import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;  // Number of positions to rotate

        int n = arr.length;
        k = k % n;  // To handle cases where k > n

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}
