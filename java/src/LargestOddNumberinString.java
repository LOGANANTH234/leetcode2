public class LargestOddNumberinString {
    public static void main(String[] args) {
        String num="52";
        int temp=0;
        for(int i=num.length()-1;i>=0;i--){
            int q =num.charAt(i);
            if(q%2!=0){

                System.out.println( num.substring(0,i+1));
            }

        }

        System.out.println(" ");
    }
}
