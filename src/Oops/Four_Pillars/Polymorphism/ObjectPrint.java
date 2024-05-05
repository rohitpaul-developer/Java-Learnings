package Oops.Four_Pillars.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override//here it is overriding the toString method present in Object class
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);//here we are not telling java to print the value of obj.num
        //(after commenting out line 10-15) here it is giving us hashcode because it is calling the toString method of object class
        //which is the default super class as all classes extends from it
    }
}