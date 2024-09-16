import java.util.Scanner;

public class Prac_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String f_str = scan.nextLine();
        String s_str = scan.nextLine();

        // since two strings are not equal, swap two strings if the second string is longer
        if (s_str.length() > f_str.length()) {
            String temp = f_str;
            f_str = s_str;
            s_str = temp;
        }

        f_str = f_str.replaceAll(s_str, "");
        System.out.println(f_str);

        scan.close();
    }
}   
