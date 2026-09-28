import java.util.Scanner;

public class CWcode8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        boolean palindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}