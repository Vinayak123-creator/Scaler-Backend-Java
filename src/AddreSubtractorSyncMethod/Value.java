package AddreSubtractorSyncMethod;

public class Value {
    public int value=0;

    public synchronized void incrementBy(int x){
        value+=x;
    }

    public synchronized void decrementBY(int x){
        value-=x;
    }

}
