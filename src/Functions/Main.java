package Functions;

class Test{
    int x;
    Test(int i){
        x=i;
    }
    Test(){
        x=0;
    }
}
public class Main {
    public static void main(String[] args) {

        //t is a reference.
        Test t = new Test(5);

        //Reference is passed and a copy of reference is created in change()
        change(t);

        //Old value of t is printed
        System.out.println(t.x);
    }
    static void change(Test t){
        //We changed reference to refer to some other location now any changes made to reference
        //are not reflected back in main()
        t = new Test();
        t.x = 10;
    }

}
