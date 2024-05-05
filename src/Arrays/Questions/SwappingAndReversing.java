package Arrays.Questions;

import java.util.Arrays;

public class SwappingAndReversing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int a = 0;
        int b = arr.length-1;
        int l = arr.length/2;
        while(a < b){
            swap(arr,a,b);
            a++;
            b--;
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
