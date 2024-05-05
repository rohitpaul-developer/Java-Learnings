package Oops.Four_Pillars.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//
//        Box box2 = new Box(4);
//
//        Box box3 = new Box(4,2,6);
//
//        Box box4 = new Box(box1);
//
//        System.out.println(box1.l+" "+box1.h+" "+box1.w);
//        System.out.println(box2.l+" "+box2.h+" "+box2.w);
//        System.out.println(box3.l+" "+box3.h+" "+box3.w);
//        System.out.println(box4.l+" "+box4.h+" "+box4.w);

//        BoxWeight b = new BoxWeight();
//        System.out.println(b.h+" "+b.weight);
//
        //       BoxWeight b1 = new BoxWeight(1,2,3,4);
//        System.out.println(b1.h+" "+b1.w+" "+b1.weight);
//        System.out.println(b1.l); this will not work because l is private and its access is limited to Box class only


//       Box box5 = new BoxWeight(1,2,3,4);
//       System.out.println(box5.weight);//Why error? although we can initialize the variables of object of child class with
        //a reference variable of parent class, we cannot access it because parent class doesn't know anything about child class

//      BoxWeight box6 = new Box(1,2,3,4);//Why error?
//      System.out.println(box6.weight);

        //Explanation:-
        //there are many variable in both parent and child class
        //you are giving access to variables that are in the ref type i.e. BoxWeight
        //hence,you should have access to weight variable
        //this also means that the ones you are trying to access should be initialized
        //but here when the object of parent class, how will you call the constructor of child class
        //that is why error,hence it is not allowed
        //we cannot have a child reference variable and a parent object

        //       BoxWeight b = new BoxWeight(b1);

        BoxPrice b = new BoxPrice();
        BoxPrice b2 = new BoxPrice(b);

        System.out.println(b2.h+" "+b2.w+" "+b2.weight+" "+b2.cost);
    }
}
