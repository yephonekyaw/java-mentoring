import java.util.Scanner;

public class P4 {
  public static boolean isMatch(String s, String p) {
    /**
     * ba aab ab
     * ba * a?
     *
     * i = 0, j = 0
     * b == b => i = 1, j = 1
     *
     * i = 1, j = 1
     * a == a => i = 2, j = 2
     *
     * i = 2, j = 2
     * last_asterisk = 2, last_match = 2, j = 3
     *
     * i = 2, j = 3
     * a == a => i = 3, j = 4
     *
     * i = 3, j = 4
     * a == ? => i = 4, j = 5
     *
     * i = 4, j = 5, last_asterisk = 2, last_match = 2
     * j = 2 + 1 = 3, last_match = 3, i = 3
     *
     * i = 3, j = 3,
     * a == a => i = 4, j = 4
     *
     * i = 4, j = 4,
     * b == ? => i = 5, j = 5
     *
     * i = 5, j = 5, last_asterisk = 2, last_match = 3
     * j = 2 + 1 = 3, last_match = 4, i = 4
     *
     * i = 4, j = 3, last_asterisk = 2, last_match = 4
     * j = 2 + 1 = 3, last_match = 5, i = 5
     *
     * i = 5, j = 3
     * a == a => i = 6, j = 4
     *
     * i = 6, j = 4
     * b == ? => i = 7, j = 5
     *
     * up to this index i, we have already matched all characters
     */

    int m = s.length(), n = p.length(), i = 0, j = 0, last_wildcard = -1, last_match = 0;
    while (i < m) {
      if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
        i++;
        j++;
      } else if (j < n && p.charAt(j) == '*') {
        last_wildcard = j;
        last_match = i;
        j++;
      } else if (last_wildcard != -1) {
        j = last_wildcard + 1;
        last_match += 1;
        i = last_match;
      } else {
        return false;
      }
    }
    // if there are extra asterisk left in the pattern
    while (j < n && p.charAt(j) == '*') {
      j++;
    }
    return j == n;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String t = scan.nextLine();
    boolean isMatch = isMatch(s, t);
    System.out.println(isMatch);
    scan.close();
  }
}