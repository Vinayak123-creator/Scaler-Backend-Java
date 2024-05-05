package constructorandinheritance;

public class D extends C{
    D(){
        System.out.println("Constructor of D is called");
    }
    D(String name){
        //this();
      //  super("param");
        System.out.println("Name "+name);
    }
}
