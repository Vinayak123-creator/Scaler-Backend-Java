package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.AndroidButton;
import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdowns.AndroidDropdown;
import FactoryDesignPattern.Components.dropdowns.Dropdowns;
import FactoryDesignPattern.Components.menu.AndroidMenu;
import FactoryDesignPattern.Components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Dropdowns createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
