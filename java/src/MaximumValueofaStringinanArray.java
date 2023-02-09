import java.util.*;
public class MaximumValueofaStringinanArray {
    public static void main(String[] args) {
        String []s ={"5232","yv","22","c","yawgs","928","4003","2"};
        System.out.println(maximumValue(s));
    }
            public  static int maximumValue(String[] s) {
                int max=0;
                for(int j=0;j<s.length;j++){
                    String temp=s[j];
                    int c=0;
                    int res=0;
                    char ch[]=temp.toCharArray();
                    for(int i=0;i<temp.length();i++){
                        if(ch[i]>=97&&ch[i]<=122){
                            c=1;
                            break;
                        }
                    }
                    if(c==1){
                        res=ch.length;
                    }
                    else{

res = Integer.valueOf(temp);

                    }
                    max=Math.max(max,res);
                   // System.out.println(max);
                }
                return max;
            }
        }


