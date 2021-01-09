import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// https://yukicoder.me/problems/no/79
public class Voting79 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String firstWeek = sc.next();
    String secondWeek = sc.next();
    String goldenWeek = firstWeek + secondWeek;

    List<String> holidayList = Arrays.asList(goldenWeek.split("x"));

    Optional<String> maxHoliday = holidayList.stream().max(Comparator.comparingInt(String::length));
    System.out.println(maxHoliday.orElse("").length());
  }
}