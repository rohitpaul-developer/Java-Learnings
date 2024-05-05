package CWH_Tutorials.Practice_Set.Practice_Set_3;

import java.util.Scanner;
public class  PRG_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        s = s.replace(" ","_");
        System.out.println(s);
    }
}
