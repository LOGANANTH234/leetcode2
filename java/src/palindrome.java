
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String A = "aabbb";
        String B = "abb";
        char[] AA = A.toCharArray();
        char[] BB = B.toCharArray();
        Arrays.toString(AA);
        Arrays.toString(BB);
        int c = 0;
       if (A.length() > B.length()) {
            for (int j = 0; j < A.length(); j++) {


                for (int z = j + 1; z < A.length(); z++) {
                    if (AA[j] == AA[z]) {

                        AA[j] = 0;
                        AA[z] = 0;
                        break;
                    } else {
                        for (int y = 0; y < B.length(); y++) {
                            if (AA[j] == BB[y]) {
                                AA[j] = 0;
                                BB[y] = 0;
                                break;
                            }
                        }
                    }
                }
            }
           for (int i = 0; i < BB.length-1; i++) {
               if(BB[i]==BB[i+1]){
                   BB[i]=0;
               }
           }
            System.out.println(Arrays.toString(AA));
            System.out.println(Arrays.toString(BB));
            int v = 0;
            for (int i = 0; i < AA.length; i++) {
                if (AA[i] != 0) {
                    v++;
                }
            }
            for (int i = 0; i < BB.length; i++) {
                if (BB[i] != 0) {
                    v++;
                }
            }
            if (v == 0 || v == 1) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
//            String s1 = String.valueOf(AA);
//            String s2 = String.valueOf(BB);
//            System.out.println(s1);
//            System.out.println(s2);
        } else {
            for (int j = 0; j < B.length(); j++) {


                for (int z = j + 1; z < B.length(); z++) {
                    if (BB[j] == BB[z]) {

                        BB[j] = 0;
                        BB[z] = 0;
                    } else {
                        for (int y = 0; y < A.length(); y++) {
                            if (BB[j] == AA[y]) {
                                BB[j] = 0;
                                AA[y] = 0;
                            }
                        }
                    }
                }
                for (int i = 0; i < AA.length-1; i++) {
                    if(AA[i]==AA[i+1]){
                        AA[i]=0;
                    }

                }
            }
//            System.out.println(Arrays.toString(AA));
//            System.out.println(Arrays.toString(BB));
            int v = 0;
            for (int i = 0; i < AA.length; i++) {
                if (AA[i] != 0) {
                    v++;
                }
            }
            for (int i = 0; i < BB.length; i++) {
                if (BB[i] != 0) {
                    v++;
                }
            }
            if (v == 0 || v == 1) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
        }
    }
