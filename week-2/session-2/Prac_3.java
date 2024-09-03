import java.util.Scanner;

public class Prac_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // summation using loop
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        // summation using math formula
        int fast_sum = (num * (num + 1)) / 2;
        System.out.println(fast_sum);

        scan.close();
    }
}
