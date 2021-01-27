import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://yukicoder.me/problems/no/1329
public class Square1329 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    double n = Double.parseDouble(sc.next());
    int sqrtN = (int) Math.floor(Math.sqrt(n));
    System.out.println(Integer.toString(sqrtN).length());
  }
}