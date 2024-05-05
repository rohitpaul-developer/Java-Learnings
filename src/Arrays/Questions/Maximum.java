package Arrays.Questions;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Number :"+max(arr));
    }
    static int max(int[] arr){
        int l = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(l<arr[i]){
                l = arr[i];
            }

        }
        return l;
    }
}

