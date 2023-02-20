public class NoOfSegmentsInAString {
    public static void main(String[] args) {
        String s="hi iam lo ' ga ,fr,  om it";
        if(s.equals("")){
            System.out.println(0);
        }
        String a[] =s.split(" ");
        int count=0;
        for(int i =0;i<a.length;i++){
            if(a[i]=="")
                count++;
        }
        System.out.println(a.length-count);
    }
}
