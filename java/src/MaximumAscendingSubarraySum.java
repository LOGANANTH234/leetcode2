public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
int nums[]={1,2,3,4,1,55,55,55,55};
        int c = 0;
        int m = nums[0];
        if (nums.length == 1)
            System.out.println( nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                m = m + nums[i];
                c = Math.max(c, m);
            } else {
                c = Math.max(c, m);
                m = nums[i];

            }

        }
        System.out.println( c);
    }
}