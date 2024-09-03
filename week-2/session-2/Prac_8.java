import java.util.Scanner;

public class Prac_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // the algorithm
        int deci = 0;
        int largest_power = str.length() - 1;
        for (int i = 0; i < str.length(); i++, --largest_power) {
            deci += ((int)Math.pow(2, largest_power) * Integer.parseInt(str.charAt(i) + ""));
            // --largest_power beside i++ is the same as writing largest_power -= 1 below this line
        }
        System.out.println(deci);

        scan.close();
    }
}
