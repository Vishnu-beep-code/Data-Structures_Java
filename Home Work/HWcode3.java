class Solution {

    public int[] findDuplicates(int[] nums) {

        int[] duplicates = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    duplicates[count] = nums[i];
                    count++;

                    break;
                }
            }
        }
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = duplicates[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        int[] result = obj.findDuplicates(nums);

        System.out.print("Duplicates: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}