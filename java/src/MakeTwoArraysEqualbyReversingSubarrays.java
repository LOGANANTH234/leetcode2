import  java.util.Arrays;
public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {
        int t[] = {1, 2, 3, 4};
        int a[] = {2, 4, 1, 3};
        int arr[] = new int[t.length * 2];
        int b = 0;

        for (int i = 0; i < t.length * 2; i++) {
            if (i < t.length) {
                arr[i] = t[i];
            } else {
                arr[i] = a[b];

                System.out.println(b);
                b++;
            }

        }


        System.out.print(Arrays.toString(arr));
        int c=0;
        for (int i = 0; i < arr.length/2; i++,c=0) {

            for (int ii = arr.length/2;ii < arr.length; ii++) {
if(arr[i]==arr[ii]){
    c++;
}
            }
            if(c==0){
                System.out.println("false");
            }
        }
    }
}
