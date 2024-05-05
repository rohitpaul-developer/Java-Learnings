package Oops.Questions.Q_1;

public class RaceCar extends Car{
    int maxSpeed;
    RaceCar(int noOfGear,String color,int maxSpeed){
        super(noOfGear,color);
        this.maxSpeed=maxSpeed;
    }
    void printRaceCarInfo(){
        printCarInfo();
        System.out.println("maxSpeed: "+maxSpeed);
    }

}

