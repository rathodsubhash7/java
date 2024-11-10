import java.util.Scanner;

public class ConvertTolowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input the string
        System.out.print("enetr a string(s): ");
        System s = sc.nextLine();

        //convert the striing to lowercase
        String result = s.toLowerCase();

        System.out.println("Lowercase: " + result);

        sc.close();

    }
}