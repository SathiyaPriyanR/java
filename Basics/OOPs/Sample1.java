class Pen {
    private String pen1;
    private String pen2;

    Pen(String pen11, String pen22) {
        this.pen1 = pen11;
        this.pen2 = pen22;
    }
    String getPen1() { return pen1; }
    String getPen2() { return pen2; }
}
class Brand extends Pen {
  Brand() {
       super("Parker","Cello");
      System.out.println(getPen1());
      System.out.println(getPen2());
    }
}
public class Sample1  {
    public static void main(String[] args) {
        Brand obj = new Brand();
    }
}
