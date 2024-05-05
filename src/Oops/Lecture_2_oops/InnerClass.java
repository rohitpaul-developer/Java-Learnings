package Oops.Lecture_2_oops;

public class InnerClass {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Rohit");
        Test b = new Test("Soham");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//here we might get confused that why it is showing Rohit and soham and not only Soham Soham
//the reason is although Test class is static it is not dependent on
//objects of InnerClass but Test and main() can have instances of each other
