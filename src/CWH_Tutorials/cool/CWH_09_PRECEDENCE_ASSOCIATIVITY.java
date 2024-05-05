package CWH_Tutorials.cool;

public class CWH_09_PRECEDENCE_ASSOCIATIVITY {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            =12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        //QUICK QUIZ
        //A.
        int x=10,y=5;
        int z= (x-y)/2;
        System.out.println(z);

        //B.
        int b=1,a=5,c=4;
        int r =(b*b-4*a*c)/(2*a);
        System.out.println(r);

        //C.
        int v=4,u=3;
        int w=v*v-u*u;
        System.out.println(w);

        //D.
        int a1=4,b1=3,d1=2;
        int c1=a1*b1-d1;
        System.out.println(c1);

    }
}
