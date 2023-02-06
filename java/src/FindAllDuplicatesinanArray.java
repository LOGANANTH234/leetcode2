import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        List<Integer> l= new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; ) {
            if(arr[i]!=i+1){
                int temp=arr[i];
                if(arr[temp-1]==temp){
                    l.add(temp);
                    i++;
                }
            }
            else i++;
        }
        System.out.println(l);
    }
    public static void cyclicSort(int arr[]){
        for (int i = 0; i < arr.length; ) {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(correct,i,arr);
            }
            else i++;
        }
    }
    public static  void swap(int i,int c,int arr[]){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}
