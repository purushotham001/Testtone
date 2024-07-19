import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three angles of a triangle:");
        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();

        // Check if the angles can form a triangle
        boolean isTriangle = checkTriangle(angle1, angle2, angle3);

        if (isTriangle) {
            System.out.println("These angles can form a triangle.");
        } else {
            System.out.println("These angles cannot form a triangle.");
        }

        scanner.close();
    }

    public static boolean checkTriangle(int angle1, int angle2, int angle3) {
        // Check the triangle inequality theorem
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            return true;
        }
        return false;
    }
}