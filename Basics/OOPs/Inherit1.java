class  Sample11{
    private void method11() {
        System.out.println("Peter");
    }
    public  void method12() {
        method11();
    }
    public  void hell() {
        System.out.println("will");
    }
}
class Sample12 extends Sample11{
     String name  = "Parker";

     public String method11() {
         return name;
     }
     public  void hell() {
         super.hell();
         System.out.println("Smith");
     }
     public String name1(){
         String name = "Jeeva";
         return name;
     }
}
class Sample13 extends Sample12 {
    public String name2() {
        return  name1();
    }
}
class Sample14 extends Sample11 {
    public void hell() {
        super.hell();
    }
}
public class Inherit1 {
    public static void main(String[] args) {
        Sample12 obj = new Sample12();
        obj.method12();
        System.out.println(obj.method11());
        obj.hell();
        Sample13 obj2 = new Sample13();
        System.out.println(obj2.name2());
        Sample14 obj3 = new Sample14();
        obj3.hell();
    }

}
