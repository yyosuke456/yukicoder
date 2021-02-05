import java.util.Scanner;

// https://yukicoder.me/problems/no/1129
public class RatingJanken1129 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());

    if (a > c) {
      System.out.println("null");
    } else if (c > a) {
      System.out.println("tRue");
    } else {
      if (b == d) {
        System.out.println("Draw");
      } else {
        switch (b) {
          case 0:
            if (d == 1) {
              System.out.println("null");
            } else {
              System.out.println("tRue");
            }
            break;
          case 1:
            if (d == 2) {
              System.out.println("null");
            } else {
              System.out.println("tRue");
            }
            break;
          case 2:
            if (d == 0) {
              System.out.println("null");
            } else {
              System.out.println("tRue");
            }
            break;
        }
      }
    }

  }
}