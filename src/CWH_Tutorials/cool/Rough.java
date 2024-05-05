package CWH_Tutorials.cool;

import java.util.Scanner;
public class Rough {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        double r=sc.nextDouble();
        int y=sc.nextInt();
        double si=(p*r*y)/100;
        System.out.println((int)si);
    }
}
