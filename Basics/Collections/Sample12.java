
import java.util.ArrayList;
public class Sample12 {
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<>() ;
        a.add("Redmi");
        a.add("Oppo");
        a.add("Vivo");
        a.add("Samsung");
        a.add("Dell");
        a.add("Asus");
        a.add("Mackbook");
        a.add("Acer");
        System.out.println(a.subList(2,6));     //extract elemnts from - to

    }
}
