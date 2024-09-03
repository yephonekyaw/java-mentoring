import java.util.Scanner;

public class Prac_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bacteria = scan.nextInt();
        
        // the algorithm
        int count = 0;
        while (bacteria != 0) {
            if (bacteria % 2 == 1) {
                count++;
            }
            bacteria /= 2;
        }

        System.out.println(count);
        scan.close();
    }
}
