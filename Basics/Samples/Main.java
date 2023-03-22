
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The age of person 1 : ");
        int age1 = scanner.nextInt();

        System.out.println("The age of person 2 : ");
        int age2 = scanner.nextInt();

        System.out.println("The age of person 3 : ");
        int age3 = scanner.nextInt();

        int oldest = (age1 > age2) ? ((age1 > age3) ? age1 : age3) : ((age2 > age3) ? age2 : age3);
        int youngest = (age1 < age2) ? ((age1 < age3) ? age1 : age3) : ((age2 < age3) ? age2 : age3);

        System.out.println("The Oldest person is " + oldest + " years old");
        System.out.println("The youngest person is " + youngest + " years old");

    }
}