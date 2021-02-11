import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// https://yukicoder.me/problems/no/1108
public class Transposition1108 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int h = Integer.parseInt(sc.next());
    List<Integer> soundList = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      soundList.add(Integer.parseInt(sc.next()));
    }
    soundList.stream().forEach(s -> System.out.println(s + 1));
  }
}