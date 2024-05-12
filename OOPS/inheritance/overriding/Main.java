package inheritance.overriding;


public class Main {
    public static void main(String[] args) {
        Square obj1 = new Square (5);
        
         obj1 = new Rectangle (5,15);
         obj1.display();
         obj1= new Square(5);
         obj1.display();

    }
    }
     class Square {
        int l;
        public Square(int l){
            this.l = l;
            
    
        }
        public  void display(){
            System.out.println(l*l);
    
        }
        
    }
     class Rectangle extends Square {
        int b;
        Rectangle(int l, int b)
        {
            super(l);
            this.b =b;
        }
        public void display(){
            System.out.println("Area = "+ l*b);
        }
        
    }
