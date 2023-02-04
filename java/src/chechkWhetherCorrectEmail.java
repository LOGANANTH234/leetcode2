import java.util.Scanner;
class chechkWhetherCorrectEmail {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String  s= in.next();
        int c=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '@' && s.charAt(i + 1) == 'g' && s.charAt(i + 2) == 'm' && s.charAt(i + 3) == 'a' && s.charAt(i + 4) == 'i' && s.charAt(i + 5) == 'l' && s.charAt(i + 6) == '.' && s.charAt(i + 7) == 'c' && s.charAt(i + 8) == 'o' && s.charAt(i + 9) == 'm') {
                c++;

            }
        }if(c!=0) {
            System.out.print("valid");
        }
        else{
            System.out.print("Invalid");

        }
    }
}
