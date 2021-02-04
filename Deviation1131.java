import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://yukicoder.me/problems/no/1131
public class Deviation1131 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());
    List<Integer> xiList = new ArrayList<Integer>();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int xi = Integer.parseInt(sc.next());
      xiList.add(xi);
      sum += xi;
    }
    double avg = sum / n;
    for (int j = 0; j < n; j++) {
      int ans = (int) ((int) 50 - (avg - xiList.get(j)) / 2);
      System.out.println(ans);
    }

  }
}