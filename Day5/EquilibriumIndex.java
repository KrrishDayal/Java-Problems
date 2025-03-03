public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // now totalSum is right sum for index i
            if(leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1; // no equilibrium index found
    }
  
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 2};
        System.out.println("Equilibrium Index: " + findEquilibriumIndex(nums)); // Output: 2
    }
}
