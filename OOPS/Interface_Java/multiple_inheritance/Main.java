package Interface_Java.multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        Child obj1 = new Child();
        System.out.println("Height of the child =" + obj1.avg_height());
    }
    
}

interface Father{
    double father_height = 180.50;
    
}
interface Mother{
    double mother_height = 150.70;
    
}

class Child implements Father, Mother{
   public double avg_height(){
    return (father_height+mother_height)/2.0;
   }

    }



