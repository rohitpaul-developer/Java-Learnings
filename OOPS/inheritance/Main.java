package inheritance;

public class Main {
    public static void main(String[] args) {
        area obj1 = new area (5,10);
        vol obj2 = new vol (5,15,5);
        obj1.display();
        obj2.display();
    }
    }
     class area {
        int l, b;
        public area(int l, int bre){
            this.l = l;
            this.b = bre;
    
        }
        public  void display(){
            System.out.println(l*b);
    
        }
        
    }
     class vol extends area {
        int h;
        vol(int l, int b, int h)
        {
            super(l,b);
            this.h =h;
        }
        public void display(){
            System.out.println("vol = "+ l*b*h);
        }
        
    }
