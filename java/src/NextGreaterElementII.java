import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,3};
        int arr[]=new int[n.length];
        int i=0;
        int moving=0;
        while(moving!=n.length) {
            int temp = n[moving];

            int stop = moving + 1;
            if(stop==n.length)
                stop=0;
            int c=0;
            //System.out.println(n[stop]);
            while (stop != moving) {
               // System.out.println(stop);
                if (temp < n[stop]) {
                    arr[moving] = n[stop];
                    i++;
                    c++;

                    break;
                }
                if (stop == n.length -1) {
                    stop = -1;


                }

               // System.out.println(stop);
                stop++;
               // System.out.println(stop);
            }
            if(c==0)
                arr[moving]=-1;
            System.out.println(Arrays.toString(arr));

            moving++;
        }
    }
}