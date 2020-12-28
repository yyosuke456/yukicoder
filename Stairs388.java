import java.util.Scanner;

// https://yukicoder.me/problems/no/289
public class Stairs388 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan

    // String １つ分を読み込む
    int s1 = Integer.parseInt(sc.next());
    int s2 = Integer.parseInt(sc.next());


    int result = s1 / s2;
    // 標準出力に書き出す。
    System.out.println(result + 1);
  }
}