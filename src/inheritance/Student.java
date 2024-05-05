package inheritance;

public class Student extends User{
    double psp;
    String batch;
    public void attendClass(){
        System.out.println("Student is attending classes");
    }
    public void doSomething(){
//      this.password="xyz";
      this.name="vinnu";
    }
}
