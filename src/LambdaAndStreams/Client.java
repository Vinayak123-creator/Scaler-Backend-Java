package LambdaAndStreams;

import Collections.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Student> l1=new ArrayList<>(List.of(
                new Student(2,"mohit",90),
                new Student(1,"Akshay",10),
                new Student(3,"Yogesh",20)
        ));

        //Method 1
        Collections.sort(l1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        //Method 2
        //(x,y)->{}
        Collections.sort(l1, (Student x,Student y)->{
            return x.name.compareTo(y.name);
        });

        int x=5;
        Runnable r=()->{
            System.out.println(x+"Hello world"+Thread.currentThread().getName());
        };
        System.out.println(r);
        Thread t=new Thread(r);

        //OR
        Thread t1=new Thread(()->{
            System.out.println("Lamda Expression");
        });

        //OR
        Thread t2=new Thread(()-> System.out.println("hey"));

        MathematicalOperaions Addition=(x1,y)->x1+y;
        MathematicalOperaions Subtraction=(x1,y)->x1-y;
//        MathematicalOperaions multiplication=(x1,y)->x1*y;

        Addition.operate(2,3);
        Subtraction.operate(1,4);

        //Streams API
        List<Integer>s1=List.of(5,4,1,3,2,6);
        Stream s=s1.stream();
        Stream s2=s1.stream();
        System.out.println(s);
        System.out.println(s.limit(4).count());  //limit method will grab only first x elements
        //This will not work : Terminal method closes the stream
      //  System.out.println(s2.limit(4).count());
        //limit method returns stream only

        //Streams doesn't affect actual data source
        System.out.println(s1);

        //Intermediate methods->returns stream interface
        //limit
        //filter
        //Map
        //Sorted

        //Terminal Methods->returns data
        //count
        //collect

//        Lambda Expression
//        s2.forEach((elem)->{
//            System.out.println("element is "+elem);
//        });

        //OR
        //Method Reference
        s2.forEach(System.out::println);

        //filter is intermediate method
        List<Integer>l2=s1
                .stream()
                .filter((elem)->elem%2==0)
                .collect(Collectors.toList());

        System.out.println(l2);

        //Map method
        List<Integer>l3=s1
                .stream()
                .filter((elem)->elem%2==0)
                .map((elem)->{
                    return elem*elem;
                })
                .sorted((x1,y)->y-x1)
                .collect(Collectors.toList());
        System.out.println(l3);

        Optional<Integer> l4=s1
                .stream()
                .filter((elem)->elem%2==0)
                .map((elem)->{
                    return elem*elem;
                })
                .sorted((x1,y)->y-x1)
                        .findFirst();
        if(l4.isPresent()){
            Integer x5=l4.get();
        }
        System.out.println(l4);

        Integer x6=s1
                .stream()
                .filter((elem)->elem%2==0)
                .map((elem)->{
                    return elem*elem;
                })
                .sorted((x1,y)->y-x1)
                .reduce(0,(curr_sum,elem)->{
                    return curr_sum+elem;
                });
        System.out.println(x6);
        Integer curr_sum=0;
        for(int i=0;i<l3.size();i++){
            curr_sum=curr_sum+l3.get(i);
        }

        Integer x7=s1
                .stream()
                .filter((elem)->elem%2==0)
                .map((elem)->{
                    return elem*elem;
                })
                .sorted((x1,y)->y-x1)
                .reduce(Integer.MIN_VALUE,(max_value,elem)->{
                    return Math.max(max_value,elem);
                });
        System.out.println(x7);

        System.out.println();

                s1
                .parallelStream()
                        .sorted((a,b)->{
                            System.out.println("Comparing "+a+" and "+b+" in "+Thread.currentThread().getName());
                            return a-b;
                        })
                        .map((elem)->{
                            System.out.println("Mapping "+elem+" in "+Thread.currentThread().getName());
                            return elem*elem;
                        })
                .filter((elem)->{
                    System.out.println("Filtering "+elem+" in "+Thread.currentThread().getName());
                  return  elem%2==0;
                })
                      //  .sorted()
                       .findAny();
                       // .sorted()
                       // .findFirst();

        //Intermediate->Lazy
        //Terminal ->Eagerly

        //Concurrent
        //Parallel

    }
}
