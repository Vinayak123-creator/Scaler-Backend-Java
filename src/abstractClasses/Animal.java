package abstractClasses;

public abstract class Animal {
    int noofLegs;

    void eat(){
        System.out.println("Using Mouth");
    }
    abstract void walk();
    abstract void makeSound();

}
