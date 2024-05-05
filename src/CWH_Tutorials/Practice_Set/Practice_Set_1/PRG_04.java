package CWH_Tutorials.Practice_Set.Practice_Set_1;

//WAP a program to convert kilometers to miles.
import java.util.Scanner;
public class PRG_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers:");
        double d = sc.nextDouble();
        double d_new =  d/1.609;
        System.out.println("Distance in miles :"+d_new);
    }
}
