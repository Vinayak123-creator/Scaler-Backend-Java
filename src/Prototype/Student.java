package Prototype;

public class Student implements Prototype<Student>{
   int id;
   String name;
   double psp;

   Student(){

   }
     Student (Student other){
       this.id=other.id;
       this.name=other.name;
       this.psp=other.psp;
   }
    public Student copy() {
        Student s=new Student(this);
        return s;
    }
}
