import java.util.ArrayList;
import java.util.List;

public class commonCharacters {
    public static void main(String[] args) {
        String a[]={"cool","lock","cook"};
        String temp=a[0];
        String ans ="";
        for (int i = 1; i < a.length; i++) {
            String change=a[i];
            char c []=change.toCharArray();
            char d[]=temp.toCharArray();
            for (int j = 0; j < temp.length(); j++) {
                for (int k = 0; k < change.length(); k++) {
                    if(d[j]==c[k]){
                      c[k]=0;

                        ans=ans+d[j];
                                d[j]=0;
                        break;
                    }
                }
              //  System.out.println(ans);

            }
            temp=ans;
            ans="";
            //System.out.println(temp);
        }
        System.out.println(temp);
        char aa[]=temp.toCharArray();
           List <String> l = new ArrayList<>();
           int v=0;
           for(char c:aa) {
               String n = String.valueOf(aa[v++]);
               l.add(n);
               System.out.println(l);
           }
        }
    }

