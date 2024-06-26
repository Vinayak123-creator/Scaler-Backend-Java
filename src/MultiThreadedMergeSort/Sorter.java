package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//we need to get sorted array in return from our threads
public class Sorter implements Callable <List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService ex;

    Sorter(List<Integer>arr,ExecutorService ex){
        this.arrayToSort=arr;
        this.ex=ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }

        int mid=arrayToSort.size()/2;
        List<Integer>leftSortedArray= new ArrayList<>();
        List<Integer>rightSortedArray=new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftSortedArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightSortedArray.add(arrayToSort.get(i));
        }
        Sorter leftArraySorter= new Sorter(leftSortedArray,ex);
        Sorter rightArraySorter=new Sorter(rightSortedArray,ex);

        //ExecutorService ex=Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedArrayFuture=ex.submit(leftArraySorter);
        Future<List<Integer>>righttSortedArrayFuture=ex.submit(rightArraySorter);

        List<Integer>sortedLeftArray=leftSortedArrayFuture.get();
        List<Integer>sortedRightArray=righttSortedArrayFuture.get();

        //Merge Sort
        int i=0;
        int j=0;

        List<Integer>sortedArray=new ArrayList<>();

        while (i<sortedArray.size() && j<sortedArray.size()){
            if(sortedArray.get(i)<=sortedArray.get(j)){
                sortedArray.add(sortedLeftArray.get(i));
                i+=1;
            }else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }
        while (i<sortedLeftArray.size()){
            sortedArray.add(sortedLeftArray.get(i));
            i+=1;
        }
        while (j<sortedRightArray.size()){
            sortedArray.add(sortedRightArray.get(j));
            j+=1;
        }
        return sortedArray;
    }
}
