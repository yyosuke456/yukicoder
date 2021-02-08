import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://yukicoder.me/problems/no/998
public class FourIntegers998 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    List<Integer> forIntegerList = new ArrayList<Integer>();
    for (int i = 0; i < 4; i++) {
      forIntegerList.add(Integer.parseInt(sc.next()));
    }
    Collections.sort(forIntegerList);
    for (int i = 0; i < 3; i++) {
      if (forIntegerList.get(i) + 1 != forIntegerList.get(i + 1)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}