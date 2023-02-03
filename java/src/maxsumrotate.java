import java.util.Arrays;

public class maxsumrotate {

    public static void main(String[] args) {
 int arr[]={3,6,1,89,13,10,20};

int max=0;
        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            rotate(arr);
            for (int j = 0; j < arr.length; j++) {
                sum=sum+j*arr[j];
            }
            max= Math.max(max,sum);

        }
        System.out.println(max);
    }
    public static void rotate(int arr[]){
        for (int i = arr.length - 1; i > 0; i--) {
            int t = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = t;
        }

    }
}