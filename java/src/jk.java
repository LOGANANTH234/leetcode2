public class jk {
    public static void main(String[] args) {
        int arr[]={2,3,-1,8,4};
        int s=0;
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            t=t+arr[i];
        }
        System.out.println(t);
        for (int i = 0; i < arr.length; i++) {
            if(t-arr[i]==s){
                System.out.println(i);
            }
            else{
                s=arr[i]+s;
                t=t-arr[i];
            }
        }
        System.out.println(-1);
    }
}




