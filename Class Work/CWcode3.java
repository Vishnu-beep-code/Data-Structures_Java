class Main {
    public static void main(String[] args) {

        int[] arr = {20, 40, 10, 50, 60, 55, 30, 25};

        int n = arr.length;
        int k = 4;

        for (int i = 0; i <= n - k; i++) {

            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }
    }
}