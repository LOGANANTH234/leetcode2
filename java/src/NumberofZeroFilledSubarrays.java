import java.util.ArrayList;
import java.util.Arrays;

public class NumberofZeroFilledSubarrays {
    public static void main(String[] args) {
        int  n[] = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int arr[]= new int[n.length];
        int g=0;

        int a=0;
        for (int j=0; j <n.length ; j++) {
            if(n[j]==0){
                a++;

            }
            else{

                arr[g++]=a;
                //  break;
                a=0;
            }
            if(a!=0)
                if(j==n.length-1){
                    arr[g++]=a;
                }

        }

        long ans=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                while (arr[i]!=0){
                    ans=ans+arr[i];
                    arr[i]--;
                }
            }
        }
        System.out.println(ans);

    }
}

