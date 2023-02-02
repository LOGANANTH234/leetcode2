public class divideNumberWithoutDivisor {
    public static void main(String[] args) {
        int frstnumber = 17;
        int secondNumber = 7;
        for (int i = 1; i <= frstnumber; i++) {
            if (i * secondNumber == frstnumber) {
                System.out.println(i);
            }
            
            if (i * secondNumber < frstnumber && (i+1) * secondNumber > frstnumber) {
                System.out.println(i);
            }

        }
    }
}
