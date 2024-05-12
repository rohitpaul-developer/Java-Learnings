

public class Main {
    public static void main(String[] args) {
        Fig obj1 = new Rectangle (5,10);
        Fig obj2 = new Triangle (5,10);
        double area_Rectangle = obj1.area();
        double area_Triangle = obj2.area();
        obj1.display();
        obj2.display();
        System.out.println("Area of the rectangle:" + area_Rectangle);
        System.out.println("Area of the Triangle:" + area_Triangle);
    }
    }

    abstract class Fig {
      int l;
      int b;
      Fig(int l, int b){
        this.l =l;
        this.b = b;
      }
      abstract double area();  
      void display(){
        System.out.println("Hello!");
      }  
        
    }
     class Rectangle extends Fig {
        Rectangle(int l, int b){
            super(l, b);

        }
        double area(){
            return l*b;
        }
        
    
        }
        
     class Triangle extends Fig {
        Triangle(int l, int b){
         super(l,b);
        }
            double area(){
                return 0.5*l*b; 
            }
         }

