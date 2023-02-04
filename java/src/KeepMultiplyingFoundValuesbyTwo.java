import java.util.Arrays;

public class KeepMultiplyingFoundValuesbyTwo {
   // https://leetcode.com/problems/keep-multiplying-found-values-by-two/
    public static void main(String[] args) {
        int arr[]={5,3,6,1,12};
        int tar=3;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==tar){
                tar = tar*2;
              
            }
        }
        System.out.println(tar);
    }
}
