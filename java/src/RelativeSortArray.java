import java.util.Arrays;

public class RelativeSortArray {

    public static void main(String[] args) {
        int n []= {2,3,1,3,2,4,6,7,9,2,19}; int m[] = {2,1,4,3,9,6};

        int arr[]= new int [n.length];
        int t=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<n.length;j++){

                if(m[i]==n[j]){
                    arr[t++]=n[j];
                    n[j]=-1;
                }

            }
        }
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(n[i]!=-1){
                arr[t++]=n[i];
            }
        }
        System.out.println(arr);

    }
}