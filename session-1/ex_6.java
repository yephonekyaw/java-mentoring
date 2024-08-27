import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String res = "";
        char prev_char = '-';
        
        for (int i = 0; i < str.length(); i++) {
            char cur_char = str.charAt(i);
            if ((cur_char == '?' || cur_char == '!') && cur_char == prev_char) {
                continue;
            }
            prev_char = cur_char;
            res += cur_char;
        }
        System.out.println(res);
        scan.close();
    }
}
