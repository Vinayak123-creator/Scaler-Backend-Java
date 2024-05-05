package inheritance;

public class Client {
    public static void main(String[] args) {
        User user=new User();
        Student student =new Student();
        student.login();
        student.setName("Vinayak");
        student.login();
        student.setPassword("xyz");
        System.out.println(student.getPassword());

    }
}
