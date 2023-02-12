import java.sql.SQLOutput;

public class MinimumMovestoConvertString {
    public static void main(String[] args) {
        String s="XXXOXXX";
        int count =0;
       // int h=0;
      //  System.out.println(s.length());
        int i=0;
        while (i<s.length()){
            if (s.charAt(i) == 'X') {
                i = i + 3;
                count++;
            } else {

                i++;
            }
        }










        System.out.println(count);
    }
}
