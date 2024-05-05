package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2, 3, "rohit", "Rahul", "divya");
//        demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v)//variable length arguments should always be at the end
    {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

