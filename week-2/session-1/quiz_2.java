import java.util.Scanner;

public class quiz_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String binary = "";
        while (num != 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println(binary);
        scan.close();
    }
}
