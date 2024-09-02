import java.util.Scanner;

public class quiz_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 0, b = 1;
        if (num >= 0) System.out.print(a);
        if (num >= 1) System.out.print(" " + b);
        int next = a + b;
        while (next <= num) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
        scan.close();
    }
}
