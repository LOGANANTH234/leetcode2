public class divideNumberWithoutDivisor {
    public static void main(String[] args) {
        int frstnumber = 17;
        int secondNumber = 7;
        for (int i = 1; i <= frstnumber; i++) {
            if (i * secondNumber == frstnumber) {
                System.out.println(i);
            }
            int t = i + 1;
            if (i * secondNumber < frstnumber && t * secondNumber > frstnumber) {
                System.out.println(i);
            }

        }
    }
}
