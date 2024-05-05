package Oops.Four_Pillars.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //already covered
    @Override
    public String toString() {
        return super.toString();
    }

    //already covered
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    //we will go in details when we do hashmaps lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        return this.num == ((ObjectDemo)obj).num;
//    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);//This can be modified check line 30-32
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(34);
//        ObjectDemo obj2 = new ObjectDemo(34);
//        ObjectDemo obj3 = obj;
//        System.out.println(obj.hashCode());
//        System.out.println(obj.hashCode());
//        System.out.println(obj.hashCode());

        ObjectDemo obj = new ObjectDemo(34,56.5f);
        ObjectDemo obj2 = new ObjectDemo(34,5.4f);
        ObjectDemo obj3 = new ObjectDemo(34,56.5f);
        ObjectDemo obj4 = obj;

        //This checks whether the object is pointing to the same memory location and not the inner content.
        if(obj == obj2){
            System.out.println("The objects are pointing to the same address");
        }

//        This checks the inner content of it and also the memory location.
//        if(obj.equals(obj2)){
//            System.out.println("The numbers of obj and obj2 are same");
//        } To check this uncomment line 30-32

        if(obj.equals(obj3)){
            System.out.println("The contents of obj and obj3 are same");
        }

        if(obj.equals(obj4)){
            System.out.println("The contents of obj and obj4 are same");
        }


        System.out.println(obj.getClass().getName());

        System.out.println(obj instanceof ObjectDemo);
    }
}
