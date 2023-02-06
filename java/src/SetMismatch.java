import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1, 1};
        cyclicSort(arr);
        int arr1[]= new int[2];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
arr1[0]=arr[i-1];
arr1[1]=i+1;
break;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static  void cyclicSort(int arr[]){
        for (int i = 0; i < arr.length; ) {
            int c= arr[i]-1;
            if(arr[i]!=arr[c]){
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
