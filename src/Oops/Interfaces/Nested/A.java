package Oops.Interfaces.Nested;

public class A {
    //nested interface
    public interface nestedinterface{
        boolean isodd(int num);
    }
}

class B implements A.nestedinterface{
    @Override
    public boolean isodd(int num){
        return num%2==1;
    }
}
