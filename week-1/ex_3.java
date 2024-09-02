import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // the black box
        for (int i = 1; i <= (num * 2) - 1; i++) {
            int control = i > num ? num - (i % num) : i;
            for (int j = 1; j <= control; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
