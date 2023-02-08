public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int start=0;
        int end= arr.length-1;
        int breadth=arr.length-1;
        int max=-1;
        while(start<end){
         int small=   Math.min(arr[start],arr[end]);
           System.out.println(small);
            int water = breadth*small;
            //System.out.println(water);
            max =Math.max(max,water);
            //System.out.println(max);
            breadth=breadth-1;
            if(arr[start]<arr[end]){
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(max);
    }
}
