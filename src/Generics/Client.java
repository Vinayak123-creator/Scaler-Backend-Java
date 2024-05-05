package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        Pair<Integer,String>p1 =new Pair<>();

       String s= p1.getSecond();

        //Raw Types(object,object)
        HashMap hm=new HashMap();
        hm.put(10,"vinnu");
        hm.put("manu",20.0);

        HashMap<String,Double>hm1=new HashMap<>();

        Pair p2=new Pair();
        p2.doSome("String");
       // Pair.<String>doSomething("String");
        String x=p2.doSomething("String");

        Integer x3=Pair.<String,Integer>doSomething("mohit");


        List<Dog>dogs=new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        Util.printAnimals(dogs);

        List<? extends Animal>y=new ArrayList<Dog>();

        System.out.println(dogs);
    }
}
