package CWH_Tutorials.Practice_Set.Practice_Set_1;

//WAP to check whether the user has inputted integer or not.
import java.util.Scanner;
public class PRG_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
