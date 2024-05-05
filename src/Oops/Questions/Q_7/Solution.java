package Oops.Questions.Q_7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.divisor_sum(n));
    }
}
