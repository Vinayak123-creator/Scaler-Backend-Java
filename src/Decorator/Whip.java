package Decorator;

public class Whip implements AddOn{
    Beverage b;

    Whip(Beverage b){
        this.b=b;
    }
    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Whip has been added");
    }

    @Override
    public int getCost() {
        return 20+b.getCost();
    }
}
