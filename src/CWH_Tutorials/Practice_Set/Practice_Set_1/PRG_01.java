package CWH_Tutorials.Practice_Set.Practice_Set_1;

import java.util.Scanner;

public class PRG_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,s;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = a+b+c;
        System.out.println("Sum of the three numbers is:"+s);
    }
}
