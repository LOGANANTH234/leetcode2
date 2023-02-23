import java.util.Arrays;

public class concentationOfArray {
    public static void main(String[] args) {
   int arr[]={1,2,3,4};
   int arr1[]=new int[arr.length*2];
        for (int i = 0; i < arr1.length; i++) {
            if(arr.length>i){
                arr1[i]=arr[i];
            }
            else{
                arr1[i]=arr[i-arr.length];
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}
