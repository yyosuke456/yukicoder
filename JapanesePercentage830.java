import java.util.Scanner;

// https://yukicoder.me/problems/no/1003
public class JapanesePercentage830 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());
    System.out.println(n * 10);
  }
}