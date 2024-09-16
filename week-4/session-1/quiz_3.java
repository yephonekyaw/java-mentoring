import java.util.Scanner;

public class quiz_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // algorithm
        int three_front = num / 1000;
        int three_back = num % 1000;
        int two_back = num % 100;
        int sum = 0;
        
        // first prize
        if (num == 199606) {
            sum += 6000000;
        }

        // second prizes
        if (three_front == 173 || three_front == 220) {
            sum += 4000;
        }
        if (three_back == 388 || three_back == 94) {
            sum += 4000;
        }

        // third prize
        if (two_back == 94) {
            sum += 2000;
        }

        System.out.println(sum);
        scan.close();
    }
}
