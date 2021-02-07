import java.util.Scanner;

// https://yukicoder.me/problems/no/1040
public class Virtical1040 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    int angle = Integer.parseInt(sc.next());
    if (angle % 360 == 90 || angle % 360 == 270) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}