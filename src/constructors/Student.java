package constructors;

public class Student {
    int id;
   // String name;
    int gradYear;
    Exam exam;
    double psp;

    Student(){
        this.id=1;
        //this.name="new Student";
        this.gradYear=2022;
        this.psp=90.2;
        this.exam=new Exam(25);
    }
    Student(String name, int gradYear){
      //  System.out.println(this.name);
        //this.name=name;
        this.gradYear=gradYear;
        this.exam=new Exam(35);
    }
    Student(Student original){
        this.id=original.id;
        this.gradYear=original.gradYear;
       // this.name=original.name;
        this.psp=original.psp;
        this.exam=new Exam(original.exam.exam_id);
    }

}
