public class Sample {
    public static void main(String[] args) {
        String a = "incoming call";
        String b = "dialling";
        String c = new String(a);

        System.out.println(b.contains("wall"));  // contains
        System.out.println(a.charAt(1));         // charAt
        System.out.println(c.endsWith(a));       // endsWith
    }
}
