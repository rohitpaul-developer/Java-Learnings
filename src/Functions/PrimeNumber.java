package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        int c = 0;
        if(n<=1){
            return false;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            return c < 3;
        }
    }
}
