package Oops.Four_Pillars.Inheritance;

public class Box {
    private double l ;
    double h ;
    double w ;
//    double weight = 10;

    Box() {

        //super(); //inheriting from Object Class
        this.l = -1;
        this.h = 1;
        this.w = 0;
    }

    //cube
    Box(double a) {
        this.l = a;
        this.h = a;
        this.w = a;
    }

    //cuboid
    Box(double a, double b, double c) {
        this.l = a;
        this.h = b;
        this.w = c;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}

