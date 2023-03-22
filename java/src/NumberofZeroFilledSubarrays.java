import java.util.ArrayList;
import java.util.Arrays;

public class NumberofZeroFilledSubarrays {
    public static void main(String[] args) {
        int  n[] = { 1,3,0,0,2,0,0,4};

        int arr[]= new int[n.length];
        int total=0;
        int g=0;

int a=0;
            for (int j=0; j <n.length ; j++) {
                if(n[j]==0){
                  a++;
                    System.out.println("ffff");
                }
                else{

                 total=total+a;
                    //  break;
                    a=0;
                }
                if(a!=0)
                if(j==n.length-1){
                   total=total+a;
                }
                System.out.println(j);
            }
            System.out.println(Arrays.toString(arr));
           // System.out.println(al);
//            al.clear();;
        int ans=0;

              while (total!=0){
                  ans=ans+total;
                  total--;
              }


        System.out.println(ans);

        }
    }

