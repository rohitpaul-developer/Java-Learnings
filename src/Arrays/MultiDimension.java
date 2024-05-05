package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        int[][] arr = new int[3][3];//adding the rows is mandatory but not the columns
//        int[][] arr = {
//                {1,2,3},//0th index
//                {4,5,6},//1st index
//                {7,8,9} //2nd index
//        };

        //input
        for(int i = 0; i <arr.length; i++){
            //for each column at every row
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output
//        for(int i = 0; i <arr.length; i++){
//            //for each column at every row
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }

//        for (int i = 0; i <arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
