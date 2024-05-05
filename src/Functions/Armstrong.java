package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int n = sc.nextInt();
        for(int i=100;i<1000;i++) {
            if(isArmstrong(i)){
                System.out.print(i+"\t");
            }
        }
    }
    static boolean isArmstrong(int n){
        int x,d,s=0;
        x = n;
        while(n>0){
            d = n % 10;
            s = s + (d*d*d);
            n = n / 10;
        }
        return x==s;
    }
}

