package Oops.Questions.Q_1;

public class Car {
    int noOfGear;
    String color;
    Car(int noOfGear,String color){
        this.noOfGear=noOfGear;
        this.color=color;
    }
    void printCarInfo(){
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("color: "+color);
    }
}
