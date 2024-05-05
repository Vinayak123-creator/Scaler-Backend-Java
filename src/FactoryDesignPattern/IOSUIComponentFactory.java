package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.button.IOSButton;
import FactoryDesignPattern.Components.dropdowns.Dropdowns;
import FactoryDesignPattern.Components.dropdowns.IOSDropdown;
import FactoryDesignPattern.Components.menu.IOSMenu;
import FactoryDesignPattern.Components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdowns createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
