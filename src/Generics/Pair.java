package Generics;

public class Pair <V,S> {
    V first;
    S second;

    //Static attributes doesn't get tied to the object instead with class

    //Generic methods
    public static <T,M> M doSomething(T something){
       // T x=something;
       // System.out.println(something);
        return null;
    }

    public <K> void doSome(K temp){
        System.out.println("Something something");
    }

    public void getFirst(V x){
        this.first=x;
    }
    public S getSecond(){
        return this.second;
    }


}
