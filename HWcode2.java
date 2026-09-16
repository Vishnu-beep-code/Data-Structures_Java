import java.util.*;
class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int i : nums) {
            if (set.contains(i)) {
                res.add(i);
            } else {
                set.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDuplicates(nums);

        System.out.println(result);
    }
}