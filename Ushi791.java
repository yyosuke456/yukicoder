import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://yukicoder.me/problems/no/791
// エラーの解決の参考：https://zero-config.com/java/list0001.html
public class Ushi791 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();

    List<String> list = new LinkedList(Arrays.asList(s.split("")));
    if (!list.get(0).equals("1")) {
      System.out.println(-1);
      return;
    }
    list.remove(0);
    List<String> threeList = list.stream().filter(a -> a.equals("3")).collect(Collectors.toList());
    if (list.size() == threeList.size() && threeList.size() != 0) {
      System.out.println(threeList.size());
    } else {
      System.out.println(-1);
    }
  }
}