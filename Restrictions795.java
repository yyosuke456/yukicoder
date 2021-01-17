import java.util.Scanner;

// https://yukicoder.me/problems/no/795
public class Restrictions795 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    long n = Long.parseLong(sc.next());
    long m = Long.parseLong(sc.next());

    n += m / 10;
    m %= 10;
    if (n % 2 == 0 && m % 2 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}