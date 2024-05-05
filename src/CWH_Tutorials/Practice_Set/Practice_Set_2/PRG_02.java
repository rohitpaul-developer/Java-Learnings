package CWH_Tutorials.Practice_Set.Practice_Set_2;

//WAP to encrypt a grade by adding 8 to it. Decrypt it by subtracting 8 from it.

public class PRG_02 {
    public static void main(String[] args) {
        //Encryption
        char grade = 'A';
        grade =(char)(grade+8);
        System.out.println(grade);

        //Decryption
        grade = (char)(grade-8);
        System.out.println(grade);

    }
}
