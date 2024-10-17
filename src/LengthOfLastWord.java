import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {
         System.out.println(lengthOfLastWord("Hello World"));
    }

    public  static  int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        String lastSte = str[n-1];
        return lastSte.length();
    }
}
