import java.util.Scanner;

/**
 * quiz_1
 */
public class quiz_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}