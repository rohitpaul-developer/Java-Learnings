package Oops.Lecture_2_oops;

public class Main {
    public static void main(String[] args) {
        //       Human rohit = new Human(18,"Rohit Paul",50000,false);
        //       Human soham = new Human(18,"Soham Sutradhar",20000,false);
        //       Human debargha = new Human(19,"Debargha Roy",10000,true);
        //
        //       System.out.println(Human.population);//it will still work with rohit.population but the convention is to use the class name
        //       System.out.println(Human.population);//because population is not in the object but it is in the class.
        //       System.out.println(Human.population);
    }

    //this is not dependent on objects
    static void fun(){
//       greeting();//you cannot use this because it requires an instance
        //but the function you are using it in does not depend on instances

        //you cannot access non-static stuff without referencing their instances in a static content

        //hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }

    //we know that something which is not static, belongs to an object
    void greeting(){
        //fun();//static stuff can be accessed inside non-static method
        System.out.println("Hello World");
    }
}
