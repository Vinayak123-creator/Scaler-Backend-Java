package LambdaAndStreams;

public class Student implements Comparable<Student>{
    int id;
    String name;
    int psp;

    Student(int id,String name,int psp){
        this.id=id;
        this.name=name;
        this.psp=psp;
    }

    @Override
    public int compareTo(Student o) {
        //if both objects are similar return 0;
        //if you want this object to come first return -1;
        //return 1;
        if(this.id<o.id)return -1;
        else if(this.id>o.id)return 1;
        return 0;
    }
}
