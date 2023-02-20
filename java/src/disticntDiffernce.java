public class disticntDiffernce {
    public static void main(String[] args) {
    int n[]={1,2,2,1};
    int k=1;
    int c=0;
int j=0;
        for (int i = 0; i < n.length; ) {
            if(n[i]+k==n[j]){
                c++;
                j++;
                System.out.println(n[i]);
            }
            else{
                j++;
            }
            if(j>n.length-1){
                j=0;
                i++;
            }
        }
        System.out.println(c);
    }
}