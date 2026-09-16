import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {

            if (set.contains(i)) {
                return true;
            }

            set.add(i);
        }

        return false;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);

        System.out.println(result);
    }
}