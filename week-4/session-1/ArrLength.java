import java.util.Scanner;

public class ArrLength {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt(); // size = 5
    int arr[][] = new int[size][size];
    for (int i = 0; i < arr.length; i++) {
      int starting_point = size - i;
      // i = 0 => starting = 5
      // i = 1 => starting = 4
      // i = 2 => starting = 3
      // i = 3 => starting = 2
      // i = 4 => starting = 1
      for (int j = 0; j < size - i; j++){
        // i = 0 => j < 5
        // i = 1 => j < 4
        // i = 2 => j < 3
        // i = 3 => j < 2
        // i = 4 => j < 1
        arr[i][j] = starting_point;
        starting_point -= 1;
      }
    }

  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < size - i; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println();
  }
  scan.close();
  }
}
