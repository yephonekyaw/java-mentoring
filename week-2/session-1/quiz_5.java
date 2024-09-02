import java.util.Scanner;

/**
 * quiz_5
 */
public class quiz_5 {
    static void loop_method() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine() + " ";
        double sum = 0.0, sum_of_squared = 0.0;
        int total_ele = 0;
        String cur_num = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                double num = Double.parseDouble(cur_num);
                sum += num;
                sum_of_squared += Math.pow(num, 2);
                cur_num = "";
                total_ele++;
                continue;
            }
            cur_num += str.charAt(i);
        }

        double mean = sum / total_ele;
        double squared_of_sum = Math.pow(sum, 2);
        double numerator = sum_of_squared - (squared_of_sum / total_ele);
        int denominator = total_ele - 1;
        double sd = Math.sqrt(numerator / denominator);
        System.out.println("Mean: " + mean);
        System.out.println("SD: " + String.format("%.5f", sd));
        scan.close();
    }

    public static void main(String[] args) {
        loop_method();
    }
}