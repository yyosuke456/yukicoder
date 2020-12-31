import java.util.Scanner;

// https://yukicoder.me/problems/no/244
public class onesGraph244 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int s1 = Integer.parseInt(sc.next());
    int result = s1 - 1;
    // 標準出力に書き出す。
    System.out.println(result);
  }
}