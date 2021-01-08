import java.util.Scanner;

// https://yukicoder.me/problems/no/558
public class Contain575_558 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();

    if (s.contains("575")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}