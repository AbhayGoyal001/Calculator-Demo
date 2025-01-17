import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (b != 0 && c != 0) {
            double result = a / b / c;
            System.out.println("The result of division is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
