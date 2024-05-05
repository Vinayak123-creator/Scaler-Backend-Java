package constructors;

public class Client {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("vinnu",2000);
        Student s2=new Student(s1);
        System.out.println(s1.exam.exam_id);
        s2.exam.exam_id=48;
        System.out.println(s2.exam.exam_id);
       // student s3=s2;
        //System.out.println(s.name);
        System.out.println(s.psp);
    }
}
