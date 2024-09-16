import java.util.Scanner;

public class quiz_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yr = scan.nextInt();
        int m = scan.nextInt();
        int q = scan.nextInt();

        
        // algorithm
        if (m == 1 || m == 2) {
            m = m + 12;
            yr = yr - 1;
        }
        int j = yr / 100;
        int k = yr % 100;
        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        switch (h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
        scan.close();
    }
}
