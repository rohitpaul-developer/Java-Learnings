package CWH_Tutorials.Practice_Set.Practice_Set_1;

/*
  WAP a program that take the name from the user and greets
  with "Hello <name>, have a good day" txt.
*/

import java.util.Scanner;

public class PRG_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:");
        String str = sc.nextLine();
        System.out.println("Hello "+str+",have a good day!");
    }
}
