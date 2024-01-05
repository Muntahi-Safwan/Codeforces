// 71A Way too long words
// Problem Link: https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class WayTooLongWords_71A {

  public static void main(String[] args) {
    int n;
    String[] words;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    input.nextLine();

    words = new String[n];

    for (int i = 0; i < n; i++) {
      words[i] = input.nextLine();
    }
    for (int i = 0; i < n; i++) {
      if (words[i].length() > 10) {
        int x = words[i].length() - 1;
        String star =
          words[i].charAt(0) +
          String.valueOf(words[i].length() - 2) +
          words[i].charAt(x);
        System.out.println(star);
      } else {
        System.out.println(words[i]);
      }
    }

    input.close();
  }
}
