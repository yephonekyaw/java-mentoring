import java.util.Scanner;

public class quiz_4_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int row = scan.nextInt();

        // using an array
        if (row == 1 || row > str.length()) {
            System.out.println(str);
            scan.close();
            return;
        }
        
        String str_arr[] = new String[row];
        boolean go_down = true;
        int current = 0;

        // first initialize strings stored inside the array with empty string
        for (int i = 0; i < str_arr.length; i++) {
            str_arr[i] = "";
        }


        for (int i = 0; i < str.length(); i++) {
            str_arr[current] = str_arr[current] + str.charAt(i);
            if (go_down) {
                current = current + 1;
            } else {
                current = current - 1;
            }

            if (current == 2) {
                go_down = false;
            } else if (current == 0) {
                go_down = true;
            }
        }

        for (int i = 0; i < str_arr.length; i++) {
            System.out.print(str_arr[i]);
        }
        scan.close();
    }
}
