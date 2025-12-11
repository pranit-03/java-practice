public class student_test {
    public static void main(String[] args){
        student student1 = new student();
        student1.name = "Alice";
        student1.age = 20;
        student1.address = "Nuwakot";
        
        System.out.println("i am"+student1.name);
        student1.study("Homo sapiens");
        System.out.println(student1.write("Evolution of human being"));
        student1.gossip();

        System.out.println("-----");

        student student2 = new student();
        student2.name ="Ashmita";
        student2.address ="bagdol";

        System.out.println("i am"+student2.name);
        student2.study("Nepali");
        System.out.println(student2.write("nibanda"));
        student2.gossip();

    }
}
