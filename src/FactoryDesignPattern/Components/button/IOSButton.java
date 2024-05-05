package FactoryDesignPattern.Components.button;

public class IOSButton implements Button{
    @Override
    public int getSize() {
        return 100;
    }
}
