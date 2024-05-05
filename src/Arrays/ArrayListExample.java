package Arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(67);
//        list.add(66);
//        list.add(65);
//        list.add(69);
//        list.add(65);
//        list.add(67);
//        list.add(644);
//        list.add(670);
//        list.add(677);
//        list.add(674);
//        list.add(6747);
//        list.add(67564);
//        System.out.println(list);
//
//        list.set(0,99);
//        list.remove(4);
//
//        System.out.println(list);
//        System.out.println(list.contains(644));

        //input
        for (int i = 0 ; i < 5 ; i++){
            list.add(sc.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5 ; i++){
            System.out.println(list.get(i));
            //here list[index] syntax will not work
        }

    }


}

