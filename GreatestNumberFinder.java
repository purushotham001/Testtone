import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input five numbers
        System.out.println("Enter five numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        // Find the greatest number
        int greatestNumber = findGreatestNumber(num1, num2, num3, num4, num5);

        // Display the result
        System.out.println("The greatest number is: " + greatestNumber);

        scanner.close();
    }

    public static int findGreatestNumber(int num1, int num2, int num3, int num4, int num5) {
        int max = num1; // Assume num1 is the maximum initially

        // Compare with num2
        if (num2 > max) {
            max = num2;
        }

        // Compare with num3
        if (num3 > max) {
            max = num3;
        }

        // Compare with num4
        if (num4 > max) {
            max = num4;
        }

        // Compare with num5
        if (num5 > max) {
            max = num5;
        }

        return max; // Return the maximum number found
    }
}
