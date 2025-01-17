import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = scanner.nextInt();

        int smallest = Math.min(a, Math.min(b, d));
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
