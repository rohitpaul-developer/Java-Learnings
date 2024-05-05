package CWH_Tutorials.Practice_Set.Practice_Set_2;

//WAP to check whether a user entered number is greater than 10.
import java.util.Scanner;

public class PRG_03 {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>10);
    }
}
