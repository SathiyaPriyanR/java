
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {

      // HashMap <Integer,String> a =new HashMap<>();
        TreeMap <Integer,String> a = new TreeMap<>();
       // LinkedHashMap <Integer,String> a = new LinkedHashMap<>();
        a.put(1,"Benz");
        a.put(2,"Maruthi");
        a.put(4,"Honda");
        a.put(3,"Tata");
        System.out.println(a.get(2));
        System.out.println(a.keySet());
        System.out.println(a.headMap(2));
        System.out.println(a.tailMap(2));
        System.out.println(a.subMap(2,4));
        System.out.println(a.firstEntry());
        System.out.println(a.firstKey());
        System.out.println(a.lastEntry());
        System.out.println(a.lastKey());

        /*Iterator <Map.Entry<String,Integer>> b1 = a.entrySet().iterator();
        while (b1.hasNext()) {
            Integer c = b1.next().getValue();
            System.out.println(c);
        }*/

            for (Map.Entry b : a.entrySet()) {
            System.out.println(b.getKey() + " : " + b.getValue());
        }
    }
}
