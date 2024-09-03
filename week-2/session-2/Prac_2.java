import java.util.Scanner;

public class Prac_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // the algorithm
        if (num < 2) {
            System.out.println("Not Prime");
        } else if (num == 2) {
            System.out.println("Prime");
        } else {
            boolean has_factor = false; // initially, we assume that the numbre is prime
            for (int i = 2; i < num && !has_factor; i++) {
                if (num % i == 0) {
                    has_factor = true;
                }
            }

            if (has_factor) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }

        scan.close();
    }
}
