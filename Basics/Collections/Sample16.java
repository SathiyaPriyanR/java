
import java.util.ArrayList;
public class Sample16 {
    public static void main(String[] args) {
        ArrayList <String> a =new ArrayList<>();
        a.add("CSE");
        a.add("IT");
        a.add("ECE");
        a.add("Mechanical");
        ArrayList <String> b = (ArrayList <String>) a.clone();      // clone from 1 array to another
        System.out.println(b);
    }
}
