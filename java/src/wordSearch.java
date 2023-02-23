import java.util.*;
public class wordSearch {
    public static void main(String[] args) {
        int f[] = {3,3,3,1,2,1,1,2,3,3,4};
        int change=0;
        int m=0;
        int im=0;
        ArrayList <Integer>al= new ArrayList();
        for(int i=0;i<f.length;i++){
            if(al.contains(f[i])){
                al.add(f[i]);

            }
            else {

                change++;
                if(change==2){
                    im=i;
                }
                if(change==3){

                    change =0;
                    al.removeAll(al);

                    i=im-1;
                }
                al .add(f[i]);
            }

            m= Math.max(m,al.size());
            if(change==0){
                al.removeAll(al);
            }
            System.out.println(al);
        }
        System.out.println(m);

        System.out.println(al);
    }

}