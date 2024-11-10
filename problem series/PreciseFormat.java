import java.util.Scanner;
public class PreciseFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the first number (a): ");

        double a = scanner.nextDouble();

        System.out.print("Enetr the second number (b): ");
         double b = Scanner.nextDouble();

         //perform division and print result with 3 decimal placeees
         double result = a / b;
         System.out.println("Result:%.")
    }
}