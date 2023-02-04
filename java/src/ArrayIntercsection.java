import java.util.*;
public class ArrayIntercsection {
    public static void main(String[] args) {
        int arr1[] = {4,9,5,4,4};
        int arr2[] = {9,4,9,8,4,4};
        int count=0;
        int y=0;

        for(int i=0;i<arr1.length;i++){
            count =0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;



                }


            }
            if(count==0) arr1[i]=-1;
        }

        for(int i=1;i<arr1.length;i++){
            if(arr1[i-1]==arr1[i]) {
                arr1[i] = -1;


                count--;
                break;
            }
        }
        int cc=0;
        //   System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                cc++;
                //   System.out.println(arr1[i]);
            }
        }
        System.out.println(cc);
        Arrays.sort(arr1);
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]!=-1&&arr1[i-1]==arr1[i]){

                arr1[i-1]=-1;
                System.out.println(Arrays.toString(arr1));
                cc--;
                System.out.println(cc);
            }
        }
        //  System.out.println(Arrays.toString(arr1));
        // System.out.println(cc);

        int []arra=new int[cc];
        int c=0;
        int u=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                // System.out.println(Arrays.toString(arra));
                arra[c]=arr1[i];
                c++;
            }

        }
        //
        System.out.println(Arrays.toString(arra));

    }
}