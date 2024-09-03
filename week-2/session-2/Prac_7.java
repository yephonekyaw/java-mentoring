import java.util.Scanner;

public class Prac_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        // the algorithm
        if (str1.equals(str2)) {
            System.out.println("Perfect Match");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Partial Match");
        } else if (str1.toLowerCase().indexOf(str2.toLowerCase()) != -1 || str2.toLowerCase().indexOf(str1.toLowerCase()) != -1) {
            System.out.println("Partial Match");
        } else {
            System.out.println("Not Match");
        }

        scan.close();
    }
}
