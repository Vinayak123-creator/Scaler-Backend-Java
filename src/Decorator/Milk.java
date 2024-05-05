package Decorator;

public class Milk implements AddOn{
    Beverage b;
    Milk(Beverage b){
        this.b=b;
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk has been added");
    }

    @Override
    public int getCost() {
        return 10+b.getCost();
    }
}
