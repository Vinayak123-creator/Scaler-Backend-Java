package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;
import FactoryDesignPattern.Components.dropdowns.Dropdowns;
import FactoryDesignPattern.Components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdowns createDropdown();

}
