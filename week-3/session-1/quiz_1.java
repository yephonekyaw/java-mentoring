import java.util.Scanner;

public class quiz_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // algorithm
        int sum = num;
        for (int i = 0; i < 5; i++) {
            num = num + 1;
            if (num % 13 != 0) {
                sum = sum + num;
            } else {
                sum = sum - num;
            }
        }
        System.out.println(sum);

        scan.close();
    }
}
