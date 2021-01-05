import java.util.Scanner;

// https://yukicoder.me/problems/no/57
public class MirionDice57 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    long n = Long.parseLong(sc.next());
    System.out.println(3.5 * n);
  }
}