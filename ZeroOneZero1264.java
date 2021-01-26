import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://yukicoder.me/problems/no/1264
public class ZeroOneZero1264 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int numberOfZero = Integer.parseInt(sc.next()) - 1;
    if (numberOfZero == 0) {
      System.out.println(1);
      return;
    }
    String zeros = IntStream.range(0, numberOfZero).mapToObj(i -> "0").collect(Collectors.joining(""));
    System.out.println("010" + zeros);
    // System.out.println(replaceAll010to101(input));
  }

  private static String replaceAll010to101(String input) {
    if (input.contains("010")) {
      return replaceAll010to101(input.replaceFirst("010", "101"));
    } else {
      return input;
    }
  }
}