import java.util.Arrays;
public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int s[]={200,400,100,300,400};
        Arrays.sort(s);
        int sum=0;
        for(int i=1;i<s.length-1;i++){
            sum=sum+s[i];
            //System.out.println(sum);
        }
        double b= s.length-2;
        double ans= sum /b;
        System.out.println(ans);
    }
}
