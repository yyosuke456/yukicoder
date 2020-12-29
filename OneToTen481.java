import java.util.Scanner;

// https://yukicoder.me/problems/no/481
public class OneToTen481 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    // String １つ分を読み込む
    int result = 0;
    int n = 0;
    while (n < 9) {
      int s1 = Integer.parseInt(sc.next());
      n += 1;
      if (s1 - n > 0 && result == 0) {
        // 標準出力に書き出す。
        result = n;
      }
    }
    if (result == 0)
      result = 10;
    System.out.println(result);
  }
}
