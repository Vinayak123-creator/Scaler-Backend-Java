package IntoOOP;

public class student {
   private String name;
   public  int age;
     protected double psp;
    String batch;

    void attendClass(){
        System.out.println("Students are attending the class");
    }

    String getName(){
        return name;
    }
    void setName(String s){
       this.name =s;
    }

}
