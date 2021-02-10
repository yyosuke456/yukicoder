import java.util.Scanner;

// https://yukicoder.me/problems/no/1057
public class GoodDay1057 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if (a > b) {
      System.out.println(b * 2);
    } else if (a == b) {
      System.out.println(a * 2 - 1);
    } else {
      System.out.println(a * 2);
    }
  }
}