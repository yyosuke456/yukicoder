import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://yukicoder.me/problems/no/773
public class Contest773 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む

    int from = Integer.parseInt(sc.next());
    int to = Integer.parseInt(sc.next());

    System.out.println(sList.stream().distinct().collect(Collectors.toList()).size());
  }
}