import java.util.Scanner;

public class Prac_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // the algorithm
        int mid = str.length() / 2;
        
        // we need to think of two cases: one is even and one is odd
        String res = "";
        if (str.length() % 2 == 0) {
            res = "";
        } else {
            res += str.charAt(mid);
        }

        int i = 0, j = str.length() - 1;
        while (i < j) {
            res = str.charAt(i) + res + str.charAt(j);
            i++; j--;
        }
        System.out.println(res);

        scan.close();
    }
}
