import java.util.ArrayList;

public class SumofUniqueElements {
    public static void main(String[] args) {

        int n[] = {1,2,3,2};
        //Arrays.sort(n);
        int s=0;
        ArrayList <Integer> a = new ArrayList<>();
        for (int i = 0; i <n.length ; i++) {
            a.add(n[i]);
        }
        for (int i = 0; i < n.length;i++ ) {
     int frst= a.indexOf(n[i]);
     int second = a.lastIndexOf(n[i]);
     if(frst==second){
         s=s+n[i];

     }
//     else {
//         i=second+1;
//     }

        }
        System.out.println(s);

    }
}