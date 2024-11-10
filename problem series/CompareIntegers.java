import java.util.Scanner;
public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input two integers
        System.out.print("enter the first integer (n): ");
        int n = scanner.nextInt();
        System.out.print("Enetr the second integer (m): ");
        int m = scanner.nextInt();

        // check the realation between n and m
        if (n > m) {
            System.out.println("n is greater than m");
        } else if ( n < m) {
            System.out.println("n is less than m");

        } else {
            System.out.println("n is queal to m");
        }
        scanner.close();
    }
}