import java.util.HashMap;

class Solution {

    public int firstNonRepeating(int[] arr) {

        HashMap<Integer, Integer> sort = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sort.put(arr[i], sort.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (sort.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return 0;
    }
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] arr = {4, 5, 1, 2, 1, 4, 5};

        int result = obj.firstNonRepeating(arr);

        System.out.println(result);
    }
}