package CWH_Tutorials.Practice_Set.Practice_Set_1;

import java.util.Scanner;

public class PRG_02 {
    public static void main(String[] args) {
        double a,b,c,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects simultaneously");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        p = (a+b+c)/30;
        System.out.println("CGPA :"+p);
    }
}
