import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        cyclicSort(nums);
       // System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length;) {
            if(nums[i]!=i+1){
                System.out.println("j");
              int t=  nums[i];
              if(nums[t-1]==t){
                  System.out.println(nums[t-1]);
                  break;
              }
            }
            else i++;
        }
        System.out.println("finish");
    }
    public static void cyclicSort(int arr[]){
        for (int i = 0; i < arr.length; ) {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){

                swap(i,correct,arr);
            }
            else i++;
        }
    }
    public  static void  swap(int i, int c,int arr[]){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;

    }
}
