package Decorator;

public class HoseBlend implements Beverage{
    @Override
    public void getDesc() {
        System.out.println("HouseBlend has been added");
    }

    @Override
    public int getCost() {
        return 120;
    }
}
