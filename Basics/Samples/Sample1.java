public class Sample1 {
    public static void main(String[] args) {
        int a = 5;
        double b = 10.56;
        int c = 3;
        int d = -6;
        int e = 12334353;

        String f = Integer.toString(e);
        f = f.substring(0,1) + "5" + f.substring(2);
        System.out.println(Math.abs(d));
        System.out.println(Math.round(b));
        System.out.println(Math.min(a,c));
        System.out.println(Math.random());
        System.out.println(f);
        System.out.println(f.replace("3","8"));
    }
}