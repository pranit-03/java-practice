package Lab2;
import java.util.Scanner;

public class que2 {
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();       
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);
    }
}
    

