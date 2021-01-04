import java.util.Scanner;

// https://yukicoder.me/problems/no/128
public class Otoshidama128 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    long money = Math.floorDiv(Long.parseLong(sc.next()), 1000);
    int children = Integer.parseInt(sc.next());
    System.out.println(Math.floorDiv(money, children) * 1000);
  }
}