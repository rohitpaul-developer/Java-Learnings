package Oops.Four_Pillars.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {

        super(other);//This is same as Box b = new BoxWeight();
//        System.out.println(other.h);
        this.weight = other.weight;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }



    BoxWeight(double a, double b, double c, double weight) {
        super(a, b, c);//what is this? call the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;
//        System.out.println(this.weight);
//        System.out.println(super.weight);
    }
}

