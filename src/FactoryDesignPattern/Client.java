package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdowns.Dropdowns;
import FactoryDesignPattern.Components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Platform p=new Android();

        UIComponentFactory x=p.createUIComponentFactory();
       Button b1= x.createButton();
        Dropdowns d1=x.createDropdown();
        Menu m1=x.createMenu();

        Platform p1=new Platform("Android");
       UIComponentFactory x1= p1.createFactory();
    }
}
