import java.util.HashSet;

public class string extends HashSet {
    public static void main(String[] args) {
HashSet a =  new HashSet();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
        System.out.println(string.method(a));
        System.out.println(a);

    }
    public static HashSet method(HashSet<Integer> al) {

      while (al.size()!=al.size()-1){

          System.out.println(  al.remove(al.size()));
          al.remove(al.size());
      }
      return al;
    }


}
