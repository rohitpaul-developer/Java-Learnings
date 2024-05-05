package Oops.Interfaces.extendDemo2;

@FunctionalInterface
public interface Demo {
    void abc();
    default void show(){
        System.out.println("I am in show");
    }
}
//FunctionalInterface means that there will be only one abstract method
//and there can as many default methods.
