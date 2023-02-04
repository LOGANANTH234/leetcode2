import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"cool","lock","cook"};
        String temp =words[0];
        int c=0;
        ArrayList<Character> al=new ArrayList<>();
        ArrayList<Character> la=new ArrayList<>();
        for(int i=0;i<temp.length();i++){
            al.add(temp.charAt(i));
        }
        System.out.println(al);
        for(int i=1;i<words.length;i++){
            String temp1=words[i];
            char []ch1=temp1.toCharArray();
            System.out.println(Arrays.toString(ch1));

            for (int j = 0; j < ch1.length ; j++) {

                if(al.contains(ch1[j])){
                    // System.out.println(ch1[j]);
                    la.add(ch1[j]);
                    System.out.println(la);

                    c++;
                    ///  System.out.println(ch1[j]);
                    int h = al.indexOf(ch1[j]);
                    //  System.out.println(h);
                    al.remove(h);
                    //   System.out.println(al);
                    // System.out.println(al);

                    //  System.out.println(la);
                }

            }

        }

        char []n = new char [la.size()];
        int m=0;
        for (int i = 0; i < la.size() ; i++) {
            n[m]=la.get(i);
            m++;
        }
        Arrays.sort(n);

        int v=0;
        ArrayList<Character> raj= new ArrayList<>();
        for(int i=0;i<n.length;i=i+2){
            if(n[i]==n[i+1]){
                raj.add(n[i]);
            }
        }
//        System.out.println(Arrays.toString(n));
//        System.out.println(raj);
//        System.out.println(Arrays.toString(n));
        List<String> res= new ArrayList<>();
        for (int i = 0; i < raj.size(); i++) {
            String p =String.valueOf(raj.get(i));
            res.add(p);

        }


    }
}