package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
            Student apr23Student=new Student();
            apr23Student.name="Temp";
            apr23Student.psp=100;

            studentRegistry.register("Apr23Student",apr23Student);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);
        Student s=new Student();
        s.name="Vinayak";
        s.psp=80.0;
        Student s1=s.copy();

        Student s2=studentRegistry.get("Apr23Student");

    }
}
