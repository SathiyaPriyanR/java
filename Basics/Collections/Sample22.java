import java.util.ArrayList;

public class Sample22 {
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<>();
        a.add("CSE");
        a.add("IT");
        a.add("ECE");
        a.add("Mechanical");

        for (int i = 0; i < a.size() ; i++)
        System.out.println(i + " " + a.get(i));
    }
}
