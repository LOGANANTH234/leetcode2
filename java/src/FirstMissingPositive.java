import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; ) {
            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
            else i++;
        }
    }
    public static void cyclicSort(int arr[]){
        for (int i = 0; i < arr.length; ) {
            int c=arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[c]){
                swap(i,c,arr);

            }
            else i++;
        }
    }
    public static  void swap(int i ,int c,int arr[]){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
}

