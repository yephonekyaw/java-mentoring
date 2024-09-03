import java.util.Scanner;

/**
 * Prac_1
 */
public class Prac_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // the algorithm
        if (num == 0 || num == 1) {
            System.out.println(1);
        } else {
            int prod = 1;
            for (int i = 1; i <= num; i++) {
                prod *= i;
            }
            System.out.println(prod);
        }

        scan.close();
    }
}