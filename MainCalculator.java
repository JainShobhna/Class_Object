import java.util.Scanner;

public class MainCalculator {
    public static void main(String... args) {

        int n;
        int p;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the value of n ");
            n = input.nextInt();
            System.out.println("Please enter the value of p");
            p = input.nextInt();
        }

        MyCalc cal = new MyCalc();

        try {
            System.out.println(cal.longPower(n, p));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
