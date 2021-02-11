import java.util.Scanner;

// https://yukicoder.me/problems/no/1256
public class Continuous1256 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());
    n = n % 100;
    if (n % 3 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}