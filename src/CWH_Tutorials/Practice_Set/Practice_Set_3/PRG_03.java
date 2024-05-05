package CWH_Tutorials.Practice_Set.Practice_Set_3;

public class PRG_03 {
    public static void main(String[] args) {
        String letter = "Hello <|name|> , Thanks a lot!";
        letter = letter.replace("<|name|>","Rohit");
        System.out.println(letter);
    }
}
