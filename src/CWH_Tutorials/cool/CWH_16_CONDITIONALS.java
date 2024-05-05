package CWH_Tutorials.cool;

import java.util.Scanner;
public class CWH_16_CONDITIONALS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        boolean cond = (age>=18);
        if(cond){
            System.out.println("You can drive!");
        }
        else{
            System.out.println("You cannot drive!");
        }
    }
}

