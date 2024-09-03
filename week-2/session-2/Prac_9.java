import java.util.Scanner;

public class Prac_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // the algorithm
        String octal = "";
        while (num != 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }

        System.out.println(octal);
        scan.close();
    }
}
