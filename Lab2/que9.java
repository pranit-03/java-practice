public class que9 {
    public static void main(String[] args) {
        double tuition = 10000.0; 
        double increaseRate = 0.05; 
        
        
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + increaseRate);
        }
        
        System.out.printf("The tuition after 10 years will be RM%.2f%n", tuition);
    }
}
