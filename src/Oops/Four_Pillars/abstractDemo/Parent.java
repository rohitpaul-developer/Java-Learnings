package Oops.Four_Pillars.abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;


    public Parent(int age) {
        this.age = age;
        VALUE = 30;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
