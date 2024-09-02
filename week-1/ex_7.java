import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int catCount = 0;
        int ratCount = 0;

        // Loop through the string and count occurrences of "cat" and "rat"
        for (int i = 0; i <= input.length() - 3; i++) {
            String substring = input.substring(i, i + 3);
            if (substring.equals("cat")) {
                catCount++;
            } else if (substring.equals("rat")) {
                ratCount++;
            }
        }

        System.out.println(catCount == ratCount);
        scan.close();
    }
}
