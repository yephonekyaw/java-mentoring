import java.util.Scanner;

public class Prac_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int x = scan.nextInt();

        // the algorithm
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % x == 0) {
                res += str.charAt(i);
            }
        }
        System.out.println(res);

        scan.close();
    }
}
