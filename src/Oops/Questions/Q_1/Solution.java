package Oops.Questions.Q_1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the gear: ");
        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        //nextInt() method only consumes the integer part
        // and leaves the enter or newline character in the input buffer.
        // When the third scanner. nextLine() is called, it finds the enter
        // or newline character still existing in the input buffer, mistakes
        // it as the input from the user, and returns immediately.
        sc.nextLine();

        System.out.print("Enter the color: ");
        String color = sc.nextLine();
        System.out.print("enter the max speed: ");
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printRaceCarInfo();
    }
}

