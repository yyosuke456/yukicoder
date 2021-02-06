import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://yukicoder.me/problems/no/1217
public class Seshisuseso1217 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    String base = "abcdefghijklmnopqrstuvwxyz";
    String replaced = sc.next();
    List<String> baseList = Arrays.asList(base.split(""));
    List<String> replacedList = Arrays.asList(replaced.split(""));

    for (int i = 0; i < base.length(); i++) {
      if (!baseList.get(i).equals(replacedList.get(i))) {
        System.out.println(baseList.get(i) + "to" + replacedList.get(i));
        return;
      }
    }
  }
}