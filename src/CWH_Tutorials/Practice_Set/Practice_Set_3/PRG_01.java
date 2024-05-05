package CWH_Tutorials.Practice_Set.Practice_Set_3;

//WAP to convert a string to lowercase.
import java.util.Scanner;

public class PRG_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Your string in lower case :\n"+str);

    }
}
