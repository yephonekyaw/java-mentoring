/**
 * ex_1
 */
import java.util.*;

public class ex_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        // the black box
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }

        scan.close();
    }
}