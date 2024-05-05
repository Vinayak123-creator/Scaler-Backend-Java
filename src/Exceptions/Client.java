package Exceptions;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, EvenNumberException {
        Student s=new Student();
        System.out.println(s.something());
        //handle or throw it further
        try{
            s.doSomething(32);
            s.doSome(5);

        }catch (ClassNotFoundException ex){
            System.out.println("STOP STOP");
            throw new EvenNumberException();
        }catch (EvenNumberException ex ){
            System.out.println("Even number found");
        }catch (RuntimeException ex){
            System.out.println("Runtime exception");
        }finally {
            System.out.println("I am in finally");
           // throw new RuntimeException();
        }
//        System.out.println("I am in finally block");
//
//        try{
//            //please try to run this code
//            //if this codes runs successfully:normal
//            //if it fails go to catch block
//        }
    }
}

//Exception:checked=>you have to give the disclaimer
//RunTimeException:disclaimer is not given