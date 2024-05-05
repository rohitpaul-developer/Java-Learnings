package CWH_Tutorials.Exercise;

/* WAP to calculate the percentage of a given student in CBSE
   board exam. His marks from 5 subjects must be taken from the
   user. Also take the total marks that can be scored in each subject.
 */



import java.util.Scanner;

public class Ex_1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks in each subject");
        int t = sc.nextInt();
        System.out.println("Enter the marks in subject 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks in subject 2");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks in subject 3");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks in subject 4");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks in subject 5");
        int s5 = sc.nextInt();
        int s = s1+s2+s3+s4+s5;
        double p = (s/(t*5.0))*100;
        System.out.println("Percentage scored by the child "+p+"%");
    }
}
