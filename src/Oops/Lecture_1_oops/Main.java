package Oops.Lecture_1_oops;

import java.util.Scanner;
public class Main{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle obj=new Rectangle(l,b);
        System.out.println(obj.getArea());
    }
}

class Rectangle {
    int l;
    int b;

    Rectangle(int length, int breadth) {
        this.l = length;
        this.b = breadth;
    }
    int getArea() {
        return l * b;
    }

}
