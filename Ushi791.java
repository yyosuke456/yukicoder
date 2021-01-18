import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://yukicoder.me/problems/no/791
public class Ushi791 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();

    List<String> list = Arrays.asList(s.split(""));
    List<String> threeList = list.stream().filter(s -> s.equals("3")).collect(Collectors.toList());
    if (list.size() - 1 == threeList.size()) {
      System.out.println(threeList.size());
    } else {
      System.out.println(-1);
    }
  }
}