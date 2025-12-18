 import java.util.Scanner;
public class que11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = sc.nextInt();

      
        double futureInvestmentVal = investmentAmount *
                Math.pow(1 + annualInterestRate / 100, numberOfYears);

       
        System.out.println("Future Investment Value = " + futureInvestmentVal);

        sc.close();
    }
}

    

