class student{
    String name;
    int Age;

    void info(String name, int age){
        System.out.println(name+" "+age);
//        System.out.println(this.Age);
    }

    void info(int Age){
        System.out.println(Age);
    }

    void info(String name){
        System.out.println(name);
    }



//    student(){ non-parameterized constructor
//        System.out.println("Constructor called");
//    }

//    student(String name, String age){ parameterized constructor
//        this.name = name;
//        this.Age = age;
//    }

//    //copy constructor//
//    student(student s3){
//        this.name = s3.name;
//        this.Age = s3.Age;
//    }
//
//    student(){
//    }
}

public class opps {
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Teuton Roy";
        s1.Age =  22;

        s1.info(s1.name);
        s1.info(s1.Age);

        s1.info(s1.name, s1.Age);


//        student s2 = new student("Teuton","22");
//            s2.info();
    }

}
