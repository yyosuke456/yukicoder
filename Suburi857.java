import java.util.Scanner;

// https://yukicoder.me/problems/no/857
public class Suburi857 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    long x = Long.parseLong(sc.next());
    long y = Long.parseLong(sc.next());
    long z = Long.parseLong(sc.next());

    int rest = 0;
    if (z >= x)
      rest += 1;
    if (z >= y)
      rest += 1;

    long result = z - rest;
    if (result < 0)
      result = 0;
    System.out.println(result);
  }
}