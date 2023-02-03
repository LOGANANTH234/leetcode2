import java.util.Scanner;

class Stringrotate {
    public static void main(String[] args) {


       Scanner in = new Scanner(System.in);
       String n=in.nextLine();
        char [] ch= n.toCharArray();




        int start=0;
        int end = n.length()-1;
        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[start]);
//            System.out.println(ch[end]);
            int a =ch[start];
         //   System.out.println(a);
            if (ch[start]>=65&&ch[start]<=90||ch[start]>=97&&ch[start]<=122||ch[start]>=48&&ch[start]<=57){
                if (ch[end]>=65&&ch[end]<=90||ch[end]>=97&&ch[end]<=122||ch[end]>=48&&ch[end]<=57){
                    char t=ch[start];
//                    System.out.println(ch[end]);
//                    System.out.println(start);
                    ch[start]=ch[end];
                    ch[end]=t;

                    start++;
                    end--;

                }
                else {
                    end--;
                }



            }
            else{

                start++;
            }
if(start>end){
    break;
}
        }
        String nk =new String(ch);
        System.out.println(nk);

    }
}

//        Fiih+!\,ln

//        Sample Output 1:
//        nlhi+!\,iF

//        Sample Input 2:
//        A man, in the boat says : I see 1-2-3 in the sky

//        Sample Output 2:
//        y kse, ht ni3 21ee sIsy : a sta o-b-e ht nin amA