import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://yukicoder.me/problems/no/793
public class Ushi2_793 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());
    String En = "1" + IntStream.range(0, n).mapToObj(i -> "3").collect(Collectors.joining(""));
    System.out.println(Long.parseLong(En) % 1000000007);
  }
}