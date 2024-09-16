import java.util.Scanner;

public class quiz_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int row = scan.nextInt();
        
        // an algorithm using no array
        // exception case
        if (row == 1 || row > str.length()) {
            System.out.println(str);
            scan.close();
            return;
        }

        String res = "";
        int i = (row - 1) * 2, j = 0;
        for (int k = 0; k < row; k++) {
            int current = k;
            if (k == 0) {
                // the first line where right separator is zero
                while (current < str.length()) {
                    res = res + str.charAt(current);
                    current = current + i;
                }
            } else if (k == row - 1) {
                // the last line where left separator is zero
                while (current < str.length()) {
                    res = res + str.charAt(current);
                    current = current + j;
                }
            } else {
                boolean flag = true; // true means we add left separator and false for right separator
                while (current < str.length()) {
                    res = res + str.charAt(current);
                    current = current + (flag ? i : j);
                }
            }
            i -= 2;
            j += 2;
        }
        System.out.println(res);
        scan.close();
    }
}