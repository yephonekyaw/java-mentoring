import java.util.Scanner;

public class quiz_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        int century = year / 100;
        if (year % 100 > 0) century += 1;

        if (century % 10 == 0 || century == 11 || century == 12 || century == 13 || century % 10 > 3) {
            System.out.println(century + "th");
        } else {
            switch (century % 10) {
                case 1:
                    System.out.println(century + "st");
                    break;
                case 2:
                    System.out.println(century + "nd");
                    break;
                case 3:
                    System.out.println(century + "rd");
                    break;
            }

            /*
             * if (century % 10 == 1) System.out.println(century + "st");
             * else if (century % 10 == 2) System.out.println(century + "nd");
             * else System.out.println(century + "rd");
             */
        }
        scan.close();
    }
}
