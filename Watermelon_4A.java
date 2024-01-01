// 4A - Watermelon
// Problem Link: https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class Watermelon_4A {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    if (number >= 1 && number <= 100) {
      if (number > 2 && number % 2 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    input.close();
  }
}
