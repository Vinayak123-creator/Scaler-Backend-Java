package FactoryDesignPattern;

public class UIFactory {
    public static UIComponentFactory createUIComponentFactoryByPlatform(String p1){
        if(p1.equals("Android")){
            return new AndroidUIComponentFactory();
        }else if(p1.equals("IOS")){
            return new IOSUIComponentFactory();
        }
        return null;
    }
}
