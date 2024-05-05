package Oops.Lecture_2_oops;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
//   System.out.println(this.age);
//   can't use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1; //here population is not related to the object since it is static
        //instead of human.population we can use this.population also but Human.population is the correct convention
    }
}
