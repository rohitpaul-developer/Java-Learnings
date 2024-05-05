package Oops.Four_Pillars.Polymorphism;

public class Circle extends Shapes {

    //this will run when object of circle is created
    //hence it will override the parent class method
    @Override//this is called annotations
    void area(){
        System.out.println("Area = 3.14*r*r");
    }
}

