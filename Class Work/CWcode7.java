import java.util.Scanner;

public class CWcode7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " " + str.charAt(i));
        }

        sc.close();
    }
}