public class fibo {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        int start =0;
        int end =1;
        int tar=10;
        int res =0;
        System.out.println(0);
        for (int i = 0; i <tar-1; i++) {

            res = start + end;
            start = end;
            end = res;

            System.out.println(res);
        }
    }
}
