package Functions;

import java.util.Scanner;

public class Prime_Optimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){//instead of this we can also write c<n or c<(int)Math.sqrt(n)
            if(n % c == 0){
                return false;
            }
            c=c+1;

        }
        return true;

    }
}
