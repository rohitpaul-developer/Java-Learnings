package Oops.Questions.Q_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a , b, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part respectively");
        a= sc.nextInt();
        b= sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(a,b);
        a=sc.nextInt();
        b=sc.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(a,b);
        n=sc.nextInt();
        if(n==1){
            c1.plus(c2);
            c1.print();
        }
        else if(n==2) {
            c1.multiply(c2);
            c1.print();
        }
    }
}
