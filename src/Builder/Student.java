package Builder;

public class Student {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;
    double psp;

    private Student(Builder builder){
        //validations are done
        this.age=builder.getAge();
        this.gradYear= builder.getGradYear();
        this.name=builder.getName();
        this.psp=builder.getPsp();
    }

    public static class Builder {
        String name;
        int id;
        int age;
        int gradYear;
        String batch;
        double psp;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public void setId(int id) {
            this.id = id;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getBatch() {
            return batch;
        }

        public double getPsp() {
            return psp;
        }

        public Student build(){
            //do validations
            if(this.age>25){
                throw new IllegalArgumentException();
            }
            if(this.gradYear<2020){
                throw new IllegalArgumentException();
            }

            return new Student(this);
        }
    }


    public static Builder getbuilder(){
        return new Builder();
    }

}
