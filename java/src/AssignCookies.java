import java.util.Arrays;

public class AssignCookies {
   // //https://leetcode.com/problems/assign-cookies/
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int []arr2 = {1,1};
        int c=0;

for(int i=0;i<arr1.length;i++){
    for (int j = 0; j < arr2.length; j++) {
        if(arr1[i]<=arr2[j]){
            c++;
            arr2[j]=0;
            System.out.println(Arrays.toString(arr2));
break;

        }
    }

}
        System.out.println(c);
    }

}
