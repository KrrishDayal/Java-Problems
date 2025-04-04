public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        
        // Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        return n + 1; // If all positions are correct, return n+1
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums1)); // Output: 2
        System.out.println("First Missing Positive: " + firstMissingPositive(nums2)); // Output: 3
    }
}
