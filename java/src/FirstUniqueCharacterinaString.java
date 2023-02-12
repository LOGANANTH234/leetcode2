import java.util.ArrayList;
import java.util.Arrays;
public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
       String s = "aadadaad";
                ArrayList<Character> a =new ArrayList();

                for(int i=0;i<s.length();i++){
                    if(a.contains(s.charAt(i))){
                       a.remove(a.indexOf(s.charAt(i)));
                        System.out.println(a);
                    }
                    else
                        a.add(s.charAt(i));

                }
        System.out.println(a);
                if(a.size()!=0)
        System.out.println( a.get(0));
else
                    System.out.println(-1);

            }
        }
