import java.util.Scanner;

// https://yukicoder.me/problems/no/570
public class Brothers570 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());

    if (a > b) {
      if (b > c) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
      } else {
        if (a > c) {
          System.out.println("A");
          System.out.println("C");
          System.out.println("B");
        } else {
          System.out.println("C");
          System.out.println("A");
          System.out.println("B");
        }
      }
    } else {
      if (a > c) {
        System.out.println("B");
        System.out.println("A");
        System.out.println("C");
      } else {
        if (b > c) {
          System.out.println("B");
          System.out.println("C");
          System.out.println("A");
        } else {
          System.out.println("C");
          System.out.println("B");
          System.out.println("A");
        }
      }
    }
  }
}