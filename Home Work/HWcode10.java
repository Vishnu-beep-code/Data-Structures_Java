import java.util.*;

class Main {

    public static long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i])) {
                int left = nums[i - set.size()];
                set.remove(left);
                sum -= left;
            }
            set.add(nums[i]);
            sum += nums[i];
            if (set.size() > k) {
                int left = nums[i - k];
                set.remove(left);
                sum -= left;
            }
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