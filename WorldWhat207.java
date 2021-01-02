import java.util.Scanner;
import java.util.stream.IntStream;

// https://yukicoder.me/problems/no/07
public class WorldWhat207 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int from = Integer.parseInt(sc.next());
    int to = Integer.parseInt(sc.next());
    IntStream.range(from, to + 1).filter(n -> ((n % 3 == 0) || contains3(n))).forEach(n -> System.out.println(n));
  }

  private static boolean contains3(int n) {
    return Integer.toString(n).contains("3");
  }
}