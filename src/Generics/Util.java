package Generics;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void printAnimals(List<? extends Animal>animals){
        for(Animal animal:animals){
            System.out.println(animal.getClass());
        }
       // animals.add(new Dog());



    }
}
