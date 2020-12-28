import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

// https://yukicoder.me/problems/no/289
public class Stairs388 {


  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scannerオブジェクトを使う。
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    String s = sc.next();

    // String s = "39 10";

    List<String> inputList = Arrays.asList(s.split(" "));
    int stairNumber = Integer.parseInt(inputList.get(0));
    int floorNumber = Integer.parseInt(inputList.get(1));

    int result = stairNumber / floorNumber;
    // 標準出力に書き出す。
    System.out.println(result + 1);
  }
}