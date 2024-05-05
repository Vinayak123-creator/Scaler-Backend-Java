package Builder;

public class Client {
    public static void main(String[] args) {
       // Builder b=new Builder();
//        Builder b=Student.getbuilder();
//        b.setAge(22);
//        b.setGradYear(2022);
//        b.setName("vinayak");

        Student.getbuilder()
                .setAge(22)
                .setGradYear(2022)
                .setName("Vinayak")
                .build();

//        Student s=new Student(b);
//        Student s=b.build();
    }
}
