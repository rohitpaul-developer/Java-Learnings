

public class Main {
    public static void main(String[] args) {
        Car obj1 = new Maruti ();
        Car obj2 = new BMW ();
        
        obj1.Wheel();
        obj2.Wheel();
        obj1.Stearing();
        obj2.Breaking();
        obj1.Stearing();
        obj2.Breaking();
        
    }1
    11.
    }

    abstract class Car {
      
      
      abstract void Stearing();
      abstract void Breaking();  
      void Wheel(){
        System.out.println("This car  has four wheels");
      }  
        
    }
     class Maruti extends Car {
        
        
        void Stearing(){
         System.out.println("Ordinary Stearing");
        }
        void Breaking(){
            System.out.println("Hydraulic Breaks");
        }
    }
        
    
        
        
     class BMW extends Car {
        void Stearing(){
            System.out.println("Power Stearing");
           }
           void Breaking(){
               System.out.println("Gas Breaks");
           }
         }

