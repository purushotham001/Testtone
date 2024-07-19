// Main class
import java.util.Scanner;

public class InterestCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period in years: ");
        double time = scanner.nextDouble();

        // Create an object of InterestCalculator class
        InterestCalculator interestCalculator = new InterestCalculator();

        // Call calculateSimpleInterest method and pass the values
        double interest = interestCalculator.calculateSimpleInterest(principal, rate, time);

        // Displaying the calculated simple interest
        System.out.println("Simple Interest = " + interest);

        scanner.close();
    }
}

// Separate class to calculate Simple Interest
class InterestCalculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
