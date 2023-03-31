import java.util.ArrayList;

public class perfectSqaure {
    public static void main(String[] args) {
        int num=16;
        ArrayList<Integer> al = new ArrayList();
        for(int i=2;i<=20000;i++){
            al.add(i*i);
        }
        System.out.println(al);
        if(al.contains(num)){
            System.out.println("true");
        }
       
    }
}
