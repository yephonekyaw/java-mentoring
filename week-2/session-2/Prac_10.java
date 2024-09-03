import java.util.Scanner;

public class Prac_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // a = lenghtOfCube, b = whiteSpace
        int a = scan.nextInt();
        int b = a - 2;

        // print the first line
        System.out.println("-".repeat(a - 1) + "*".repeat(a));

        // print the upper half, int i = lineControl
        for (int i = 0; i < (a - 2); i++) {
        System.out.println("-".repeat(b - i) + "*" + "-".repeat(b) + "*" + "-".repeat(i) + "*");
        }

        // print the middle line
        System.out.println("*".repeat(a) + "-".repeat(b) + "*");

        // print the lower half
        for (int i = 0; i < (a - 2); i++) {
            System.out.println("*" + "-".repeat(b) + "*" + "-".repeat(b - i - 1) + "*");
        }

        // print the last line
        System.out.println("*".repeat(a));
        scan.close();
    }
}
