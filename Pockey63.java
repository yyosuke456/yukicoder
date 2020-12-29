import java.util.Scanner;

// https://yukicoder.me/problems/no/63
public class Pockey63 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int s1 = Integer.parseInt(sc.next());
    int s2 = Integer.parseInt(sc.next());
    int result = 0;
    while (s1 > s2 * 2) {
      s1 -= s2 * 2;
      if (s1 >= 0) {
        result += s2;
      }
    }
    // 標準出力に書き出す。
    System.out.println(result);
  }
}