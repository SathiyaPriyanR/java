
import java.util.LinkedList;
public class Linkedlist {
    public static void main (String[] args ) {
        LinkedList<String> a = new LinkedList<>();

        a.add("Dhina");
        a.add("Thangam");
        a.add("Sharma");
        a.add("Naveen");

        for (String name : a) {
            System.out.println(name);
        }
        a.remove("Thangam");
        System.out.println(a);

        if (a.contains("Sharma")) {
            System.out.println("yes");
        }

        System.out.println("Size of list: " + a.size());
    }
}
