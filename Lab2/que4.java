package Lab2;

import java.util.Scanner;

public class que4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char upper = scanner.next().charAt(0);
        char lower = Character.toLowerCase(upper);
        System.out.println("Lowercase: " + lower);
        scanner.close();
    }

}
