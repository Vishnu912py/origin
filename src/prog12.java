import java.util.StringTokenizer;

public class prog12 {
    public static void main(String[] args){
        System.out.println("hello ");
        String s = "This is a StringTokenizer Demonstration";
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
