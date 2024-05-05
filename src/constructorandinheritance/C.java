package constructorandinheritance;

public class C extends  B{
    C(){
        this("param");
        System.out.println("Constructor of C  is called");
    }
    C(String param){
        super("value");
        //super("value");
        System.out.println("Para C is called "+param);
    }
}
