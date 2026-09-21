import java.util.Scanner;

public class CWcode4 {

    public static int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum Sum: " + result);
        sc.close();
    }
}