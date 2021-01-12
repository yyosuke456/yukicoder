import java.util.Scanner;

// https://yukicoder.me/problems/no/1003
public class DiceCreate1003 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());

    if (n % 6 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}