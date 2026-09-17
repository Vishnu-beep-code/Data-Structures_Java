import java.util.*;

class HOMEWORK {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {

            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        HOMEWORK obj = new HOMEWORK();

        int[] nums = {1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);

        System.out.println(result);
    }
}