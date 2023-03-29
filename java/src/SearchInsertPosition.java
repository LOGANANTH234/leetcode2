import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
       int n[]={1,2,3,4};
       int t=5;
        int i=0;

        for( i=0;i<n.length;i++){
            if(n[i]>=t){
                System.out.println(i);
            }
            else if(n[n.length-1]<t){
                System.out.println(i);
            }
        }

    }
}
