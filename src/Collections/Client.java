package Collections;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<String> x1=new ArrayList<>();
        x1.add("Mohit");
        x1.add("Abhinav");
        x1.add("Rohit");
        x1.add("Mayank");
        x1.add("Raj");
        List<String>x2=new LinkedList<>();
        Deque<Integer>d1=new LinkedList<>();
        List<String>x3=new Vector<>();
        List<String>x4=new Stack<>();

        //Random order
        Set<String>s1=new HashSet<>();
        s1.add("Mohit");
        s1.add("Abhinav");
        s1.add("Rohit");
        s1.add("Mayank");
        s1.add("Raj");

        //Insertion order
        Set<String>s2=new LinkedHashSet<>();
        s2.add("Mohit");
        s2.add("Abhinav");
        s2.add("Rohit");
        s2.add("Mayank");
        s2.add("Raj");

        //Ascending[lexicographical] order
        Set<String>s3=new TreeSet<>();
        s3.add("Mohit");
        s3.add("Abhinav");
        s3.add("Rohit");
        s3.add("Mayank");
        s3.add("Raj");

        System.out.println(x1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Payment payment=new Payment();
        payment.status=PaymentStatus.IN_PROGRESS;

        Set<PaymentStatus>paymentStatus=EnumSet.allOf(PaymentStatus.class);
        System.out.println(paymentStatus);

        Queue<String>q=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        q.add("Mohit");
        q.add("Abhinav");
        q.add("Rohit");
        q.add("Mayank");
        q.add("Raj");

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

        System.out.println();

        List<Student>l1=new ArrayList<>(List.of(
                new Student(2,"mohit",90),
                new Student(1,"Akshay",10),
                new Student(3,"Yogesh",20)
        ));
        System.out.println("Comparable output");
        //By implementing Comparable we can give natural ordering to our classes
        Collections.sort(l1);
        for (Student s:l1){
            System.out.println(s.name);
        }

        System.out.println();

        System.out.println("Comparator output based on PSP in Descending order");
        Collections.sort(l1, new StudentPSPComparator());
        for (Student s:l1){
            System.out.println(s.name);
        }
        System.out.println();

        System.out.println("Comparator output based on Name in Ascending order");
        Collections.sort(l1, new StudentNameComparator());
        for (Student s:l1){
            System.out.println(s.name);
        }


        Collections.sort(x1);
        System.out.println(x1);



    }
}
