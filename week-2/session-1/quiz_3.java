import java.util.Scanner;

public class quiz_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String odd = "1", even = "2";
        for (int i = 3; i <= num; i++) {
            if (i % 2 != 0) odd += " " + i;
            else even += " " + i;
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        scan.close();
    }
}
