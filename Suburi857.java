import java.util.Scanner;

// https://yukicoder.me/problems/no/857
public class Suburi857 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int z = Integer.parseInt(sc.next());

    int rest = 0;
    if (z >= x)
      rest += 1;
    if (z >= y)
      rest += 1;

    int result = z - rest;
    if (result < 0)
      result = 0;
    System.out.println(result);
  }
}