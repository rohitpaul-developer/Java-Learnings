package Oops.Lecture_1_oops;

public class Constructor {
    public static void main(String[] args) {
        Student rohit = new Student(11,"Paul",54.2f);
        Student rohit1 = new Student();
        System.out.println(rohit1.name);
        System.out.println(rohit1.a);
        System.out.println(rohit1.marks);
        System.out.println(rohit.a);
        System.out.println(rohit.name);
        System.out.println(rohit.marks);
    }
}
class Student{
    int a;
    String name;
    float marks;

    Student(){
        this(10,"Rohit",98.6f);
    }
    Student(int rno,String naam,float m){
        this.a = rno;
        this.name = naam;
        this.marks = m;
    }

}
