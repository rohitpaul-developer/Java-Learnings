package Oops.Four_Pillars.Polymorphism;

public class Numbers {

    //we are passing integer then how it is taking double?
    //Java casts the integer to double.This is known as casting. watch the casting Lecture for more clear understanding.
    double sum(double a, int b){
        return a+b;
    }

//    if this is uncommented then this function will be called from line 21
//    double sum(int a, int b){
//        return a+b;
//    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,6,4));


    }
}