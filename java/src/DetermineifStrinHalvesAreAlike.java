import java.util.Locale;

public class DetermineifStrinHalvesAreAlike {
    public static void main(String[] args) {
       String h ="Uoo";
       int d = h.lastIndexOf(h.charAt(1));
        System.out.println( d);
      String s = h.toLowerCase();
        System.out.println(h);
       // System.out.println(s);
        //System.out.println(s.toLowerCase());
                int c=0;
                int c1=0;
                for(int i=0;i<s.length()/2;i++){
                    System.out.println(s.charAt(i));

                    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                        c++;

                    }
                }
                for(int i=s.length()/2;i<s.length();i++){
                    System.out.println(s.charAt(i));
                    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                        c1++;

                    }
                }
                if(c==c1){
                    System.out.println(true);
                }
                else
        System.out.println(false);
            }
        }


