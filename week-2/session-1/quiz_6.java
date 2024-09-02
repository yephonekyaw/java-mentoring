import java.util.Scanner;

/**
 * quiz_6
 */
public class quiz_6 {
    static void method_one(String first_person, int cup_no) {
        int round = 1;
        String second_person;
        
        if (first_person.equals("A")) {
            second_person = "B";
        } else {
            second_person = "A";
        }

        // first determine in which round the given cup will be consumed
        while (cup_no > round * (round + 1)) {
            round++;
        }

        if (cup_no <= round * round) {
            System.out.println(first_person);
        } else {
            System.out.println(second_person);
        }
    }

    static void method_two(String first_person, int cup_no) {
        String second_person = first_person.equals("A") ? "B" : "A";
        int round = (int)Math.round(Math.sqrt(cup_no));
        System.out.println(cup_no <= round * round ? first_person : second_person);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first_person = scan.next();
        int cup_no = scan.nextInt();

        method_one(first_person, cup_no);
        method_two(first_person, cup_no);

        scan.close();
    }
}