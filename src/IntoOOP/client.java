package IntoOOP;

public class client {
    public static void main(String[] args) {
        student s=new student();
        s.age=20;
        s.batch="BE";
       // s.name="Vinayak";
        s.setName("Vinnu");
        s.psp=86.7;
        System.out.println(s.getName());
        System.out.println(s.batch);
    }

}
