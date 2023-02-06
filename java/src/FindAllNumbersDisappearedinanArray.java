import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        numbers(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> l =new ArrayList<>() ;



        for(int i=0;i<=arr.length-1;){
            if(arr[i]!=i+1){
                l.add(i+1);
                System.out.println(i);
                i++;
            }
            else {
                System.out.println("h");
                i++;
            }
        }
        System.out.println(l);
    }
    public static void numbers(int arr[]){
        for (int i = 0; i <arr.length ; ) {
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(i,correct,arr);
            }
            else
                i++;
        }
    }
    public static void swap(int i,int correct,int arr[]){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}