import java.util.Scanner;

public class CWcode12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expression (e.g., 25 - 8): ");
        String input = scanner.nextLine();

        // Remove spaces manually
        String cleanInput = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != ' ') {
                cleanInput = cleanInput + c;
            }
        }

        char operator = ' ';
        int operatorIndex = -1;

        // Find operator
        for (int i = 0; i < cleanInput.length(); i++) {

            char c = cleanInput.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Invalid");
            return;
        }

        // Convert first number
        double num1 = 0;

        for (int i = 0; i < operatorIndex; i++) {

            char c = cleanInput.charAt(i);

            int digit = c - '0';

            num1 = num1 * 10 + digit;
        }

        // Convert second number
        double num2 = 0;

        for (int i = operatorIndex + 1; i < cleanInput.length(); i++) {

            char c = cleanInput.charAt(i);

            int digit = c - '0';

            num2 = num2 * 10 + digit;
        }

        double result = 0;

        // Perform operation
        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {

            if (num2 == 0) {
                System.out.println("Error: Division by zero.");
                return;
            }

            result = num1 / num2;
        }

        System.out.println("Output: " + result);

        scanner.close();
    }
}