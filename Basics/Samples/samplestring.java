
import java.util.Scanner;
public class samplestring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String A is : ");
        String A = obj.next();
        System.out.println("Enter String B is : ");
        String B = obj.next();


        if (A.equals(B)) {

            System.out.println("Entered Two Strings are equal");
        } else {

            System.out.println("Entered Two Strings are Not equal");


        }
    }
}
