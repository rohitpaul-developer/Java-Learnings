package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //initialization
        for(int i = 0; i <3; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}

