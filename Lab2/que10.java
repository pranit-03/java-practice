import java.util.Scanner;
public class que10 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
        sc.close();
    }
}

    

