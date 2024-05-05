package abstractClasses;

public  class Dog extends Animal{
    @Override
    void walk() {
        System.out.println("Wauh Wauh!");
    }

    @Override
    void makeSound() {
        System.out.println("I'm not a cat why do you expect a walk from me");
    }
}
