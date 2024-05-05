package access;

import IntoOOP.student;

public class client1 extends student{
    public static void main(String[] args) {
       student s= new student();
       s.age=23;

    }
    public void doSomething(){
        this.age=24;
        this.psp=09.9;
        
    }
}
