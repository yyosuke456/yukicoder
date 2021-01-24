import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://yukicoder.me/problems/no/858
public class Division858 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む

    double a = Double.parseDouble(sc.next());
    double b = Double.parseDouble(sc.next());
    double result = a * Math.pow(10, 50) / b;

    System.out.println(sList.stream().distinct().collect(Collectors.toList()).size());
  }
}