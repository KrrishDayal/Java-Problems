public class SubarraySum {
    public static boolean hasSubarrayWithSum(int[] arr, int target) {
        int start = 0, currentSum = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            while (currentSum > target && start <= end) {
                currentSum -= arr[start++];
            }
            if (currentSum == target) {
                return true;
            }
        }
        return false;
    }
  
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println("Subarray exists: " + hasSubarrayWithSum(nums, target)); // Output: true
    }
}
