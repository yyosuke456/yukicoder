import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://yukicoder.me/problems/no/1335
public class Alphabet1337_1335 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    List<String> alphabetList = Arrays.asList(sc.next().split(""));
    List<String> inputList = Arrays.asList(sc.next().split(""));

    System.out
        .println(inputList.stream().map(s -> replaceNumberToAlphabet(s, alphabetList)).collect(Collectors.joining()));
  }

  private static String replaceNumberToAlphabet(String n, List<String> alphaList) {
    if (n.matches("[+-]?\\d*(\\.\\d+)?")) {
      int i = Integer.parseInt(n);
      return alphaList.get(i);
    }
    return n;
  }
}