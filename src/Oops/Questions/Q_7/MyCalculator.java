package Oops.Questions.Q_7;

public class MyCalculator implements AdvancedArithmetic{
    MyCalculator()
    {
        System.out.println("I implemented: "+getClass().getInterfaces()[0].getName());
    }
    @Override
    public int divisor_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n ;i++)
        {
            if(n % i ==0) sum +=i;

        }
        return sum;
    }
}

