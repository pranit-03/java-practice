public class Rectangle {
    double length;
    double width;

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=45.2;
        r.width=65.2;
        System.out.println("the length is ="+r.length);
        System.out.println("the width="+r.width);
        System.out.println("The total area = "+r.length*r.width);
    
}
}
