
import java.util.ArrayList;
public class Sample7 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Twitter");
        a.add("Instagram");
        a.add("Whatsapp");
        a.add("Reddit");
        System.out.println(a.contains("Instagram"));    //Search an element
        System.out.println(a.contains("Youtube"));
        System.out.println(a.contains("twitter"));
    }
}
