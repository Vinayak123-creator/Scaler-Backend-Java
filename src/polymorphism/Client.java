package polymorphism;

public class Client {
    public static  void changePassword(User x,String new_pass){
        x.password=new_pass;
    }
    public static void main(String[] args) {
        User x= new User();
        Student y=new Student();
        TA z=new TA();

        User temp=y;
        temp.password="xyz";
         temp=z;
         y.psp=20.0;
         changePassword(x,"pass");
         changePassword(y,"new");
         changePassword(z,"member");

    }
}
