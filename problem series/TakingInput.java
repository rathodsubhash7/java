import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        
        // raedung inputs of different types 
        System.out.print("Eneter an integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter a float (b): ");
        float b = sc.nextFloat();

        System.out.print("Eneter a long (c): ");
        long c = sc.nextLong();

        System.out.print("Enter byte (d): ");
        byte d = sc.nextByte();

        // using sc.nextline() to handle the newline charaacter left by sc.nextByte()
        sc.nextLine();
        
        System.out.print("Enter a string (s): ");
        String s = sc.nextLine();  
        
        // printing each input on a new line

        System.out.prirntln("integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Long: " + c);
        System.out.println("Byte: " + d);
        System.out.println("string: " + s);

        sc.close();

        
    }
}