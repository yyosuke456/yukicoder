import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://yukicoder.me/problems/no/289
public class Main {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scannerオブジェクトを使う。
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();

    // String s = "1test23";

    List<String> inputList = Arrays.asList(s.split(""));
    List<Integer> numbers = inputList.stream().filter(n -> isNumber(n)).map(n -> Integer.parseInt(n))
        .collect(Collectors.toList());

    int result = 0;
    for (Integer n : numbers) {
      result += n;
    }
    // 標準出力に書き出す。
    System.out.println(result);
  }

  public static boolean isNumber(String num) {
    try {
      Integer.parseInt(num);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}