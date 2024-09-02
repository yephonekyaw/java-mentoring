import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // the black box
        
        // printing first half and second half separately
        for (int i = 1; i <= num; i++) {
            // print space
            for (int s = 1; s <= num - i; s++) {
                System.out.print("*");
            }
            // print number
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            // print space
            for (int s = 1; s <= num - i; s++) {
                System.out.print("*");
            }
            // print number
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // printing both parts
        for (int i = 1; i <= (num * 2) - 1; i++) {
            for (int s = 1; s <= Math.abs(num - i) % num; s++) {
                System.out.print("*");
            }
            int control = i > num ? num - (i % num) : i;
            for (int j = 1; j <= (control * 2) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scan.close();
    }
}
