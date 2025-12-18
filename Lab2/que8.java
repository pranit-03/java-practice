public class que8 {
    public static void main(String[] args) {
        double[] arr = new double[100];
       
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        
        double sum = 0;
        
        for (double val : arr) {
            sum += val;
        }
        
        System.out.println("Sum of all values in the array: " + sum);
    }
}
