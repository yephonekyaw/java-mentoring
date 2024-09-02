import java.util.Scanner;

public class quiz_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip_str = scan.nextLine(), each_num = "";
        for (int i = 0; i < ip_str.length(); i++) {
            if (ip_str.charAt(i) != '.') {
                each_num += ip_str.charAt(i);
                continue;
            }

            // if current character is dot(.)
            if (Integer.parseInt(each_num) < 0 && Integer.parseInt(each_num) > 255) {
                System.out.println(each_num);
                System.out.println("Invalid");
                scan.close();
                return;
            }
            each_num = "";
        }
        System.out.println("Valid");
        scan.close();
    }
}
