import java.util.Scanner;

// https://yukicoder.me/problems/no/427
public class TV427 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    if (h > w) {
      System.out.println("TATE");
    } else {
      System.out.println("YOKO");
    }
  }
}