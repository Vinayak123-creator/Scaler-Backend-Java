package FactoryDesignPattern;

import FactoryDesignPattern.Components.button.Button;

public class Platform {
    private String p1;
    Platform(){

    }
    Platform(String p1){
        this.p1=p1;
    }
    public void setTheme(){
        System.out.println("Set a theme");
    }
    public void setRefreshDate(){
        System.out.println("set a Refresh date");
    }
    public UIComponentFactory createUIComponentFactory(){
        return null;
    }
    public UIComponentFactory createFactory(){
        return UIFactory.createUIComponentFactoryByPlatform(this.p1);
    }

}
