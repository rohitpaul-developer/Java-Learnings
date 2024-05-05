package Oops.Lecture_2_oops;

// this is a demo to show initialization of static variables
public class Static_Initialization {
    static int a = 4;
    static int b;

    //will only run once, when the first object is created  i.e. when the class is created for the first time
    static{
        System.out.println("This ia a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        Static_Initialization obj = new Static_Initialization();
        System.out.println(Static_Initialization.a+" "+Static_Initialization.b);

        Static_Initialization.b += 3;

        Static_Initialization obj2 = new Static_Initialization();
        System.out.println(Static_Initialization.a+" "+Static_Initialization.b);

    }

}

