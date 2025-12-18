import java.util.Scanner;
public class que7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the mark (0-100): ");
        int mark = sc.nextInt();
        String grade = "";
        String description = "";
        if (mark >= 85 && mark <= 100) {
            grade = "A+";
            description = "Distinction";
        } else if (mark >= 75 && mark < 79) {
            grade = "A";
            description = "Distinction";
        } else if (mark >= 70 && mark < 74) {
            grade = "B+";
            description = " Credit";
        } else if (mark >= 65 && mark < 69) {
            grade = "B";
            description = "Credit";
        } else if (mark >= 55 && mark < 64) {
            grade = "C";
            description = "Pass";
        } else if (mark >= 50 && mark < 54) {
            grade = "D";
            description = " Pass";
        } else if (mark >= 41 && mark < 49) {
            grade = "F+";
            description = "Marginal Fail";
        } else if (mark >= 0 && mark < 40) {
            grade = "F";
            description = "Fail";
        } else {
            System.out.println("Invalid mark entered.");
            sc.close();
            return;
        }
        System.out.println("Grade: " + grade + ", Description: " + description);
        sc.close();
    }

}
