import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

// https://yukicoder.me/problems/no/203
public class GW203 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String firstWeek = sc.next();
    String secondWeek = sc.next();
    String goldenWeek = firstWeek + secondWeek;

    List<String> holidayList = Arrays.asList(goldenWeek.split("x"));
    int maxHoliday = holidayList.stream().max(s -> s.length());
    System.out.println(maxHoliday);
  }
}