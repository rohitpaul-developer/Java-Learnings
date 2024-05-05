package Functions;

public class Shadowing {
    static int x = 90;// this will be shadowed at line 10
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;//the class variable at line 8 is shadowed by line
//        System.out.println();//scope will begin when value is initialised
        x = 40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
