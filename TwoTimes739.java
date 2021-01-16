import java.util.Scanner;

// https://yukicoder.me/problems/no/739
public class TwoTimes739 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();
    String s1 = s.substring(0, s.length() / 2);
    String s2 = s.substring(s.length() / 2, s.length());

    if (s1.equals(s2)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}