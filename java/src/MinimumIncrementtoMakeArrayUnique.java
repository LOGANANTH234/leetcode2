import java.util.*;

public class MinimumIncrementtoMakeArrayUnique {
    public static void main(String[] args) {
        int n[] = {3, 2, 1, 2, 1, 7};


       Set<Integer> ts = new TreeSet<>();

        if (n.length == 1)
            System.out.println(0);
        Arrays.sort(n);
        int c = 0;
        for (int i = 0; i < n.length; i++) {

            if (ts.contains(n[i])) {
                Integer arr[]=new Integer[ts.size()];
                arr=ts.toArray(arr);

                int m =arr[arr.length-1] + 1;

                c = c + Math.abs(n[i] - m);
                ts.add(m);
            } else
                ts.add(n[i]);
        }
               System.out.println(ts);

    }
}