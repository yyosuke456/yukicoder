import java.util.Scanner;

// https://yukicoder.me/problems/no/780
public class OfflineParty780 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if (b - a >= 1) {
      System.out.println("YES");
      System.out.println(b - a - 1);
    } else {
      System.out.println("NO");
      System.out.println(a - b + 1);
    }

  }
}