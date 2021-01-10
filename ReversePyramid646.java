import java.util.Scanner;

// https://yukicoder.me/problems/no/646
public class ReversePyramid646 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());
    for (int i = 0; i < n; i++) {
      String number = "";
      int m = n - i;
      for (int j = 0; j < m; j++) {
        number += "" + n;
      }
      System.out.println(number);
    }

  }
}