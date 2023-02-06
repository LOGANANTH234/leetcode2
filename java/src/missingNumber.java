import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int arr[]={4,2,3,0};

        System.out.println(   missingNumber(arr));
    }

        public  static int missingNumber(int[] nums) {
            cyclicSort(nums);
            System.out.println(Arrays.toString(nums));
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    return i;
                }
            }
            return nums[(nums.length-1)]+1;
        }
        public static  void  cyclicSort(int arr[]){
            for (int i = 0; i < arr.length; ) {
                int correct=arr[i];
                if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                    swap(i,correct,arr);
                }
                else{
                    i++;
                }
            }
        }
        public static int []swap(int i,int j,int arr[]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            return arr;
        }
    }


