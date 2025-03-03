public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int index = 0; // position for the next non-zero element
        for (int num : arr) {
            if(num != 0) {
                arr[index++] = num;
            }
        }
        // Fill remaining array with zeros
        while(index < arr.length) {
            arr[index++] = 0;
        }
    }
  
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(java.util.Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
}
