
import java.util.HashSet;
public class Sample3 {
    public static void main(String[] args) {
        HashSet <String> a = new HashSet<>();
        a.add("Dhina");
        a.add("Naveen");
        a.add("Thangam");
        System.out.println(a);

        a.clear();
        System.out.println(a.isEmpty());
        System.out.println(a);
    }

}
