import java.util.*;

public class prog11 {
    public static void main(String[] args){
        ArrayList<String> al1 =new ArrayList<String>();
        ArrayList<String> al2=new ArrayList<String>();

        System.out.println(al1.size());
        al1.add("A");
        al1.add("B");
        al1.add("C");
        al1.add("D");
        al1.add("E");
        al2.add("F");
        al2.add("G");
        al2.add("H");
        al2.add("I");
        al2.add("J");
        System.out.println(al1.equals(al2));
        boolean res1 = al1.contains("E");
        System.out.println(res1);
        
        Iterator<String> itr = al1.iterator();
        while(itr.hasNext()) {
            String ele = itr.next();
            System.out.println(ele);
        }


    }
}
