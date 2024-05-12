package Interface_Java;

public class Main {
    public static void main(String[] args) {
        Sphere obj1 = new Sphere();
        Cone obj2 = new Cone();
        System.out.println("Volume of Sphere: "+obj1.volume(5,0));
        System.out.println("Volume of Sphere: "+obj2.volume(5,10));
    }    
}
interface Shapes{
    double pi = 3.14;
    double volume(int r, int h);
}
class Sphere implements Shapes{
    
    public double volume(int r, int h){
        return (4/3*pi*r*r*r);

    }
    }

    class Cone implements Shapes{
        
        
        public double volume(int r, int h){
            return (pi*r*r*h);
        }
    }
  

