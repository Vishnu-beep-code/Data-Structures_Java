import java.util.*;

class Main {

    public static long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long maxSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove the left element if it is already in the window
            while (set.contains(nums[i])) {
                int left = nums[i - set.size()];
                set.remove(left);
                sum -= left;
            }

            // Add current element
            set.add(nums[i]);
            sum += nums[i];

            // Keep window size k
            if (set.size() > k) {
                int left = nums[i - k];
                set.remove(left);
                sum -= left;
            }

            // Check valid window
            if (set.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        System.out.println(maximumSubarraySum(nums, k));
    }
}