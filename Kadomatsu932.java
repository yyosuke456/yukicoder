import java.util.Scanner;

// https://yukicoder.me/problems/no/932
public class Kadomatsu932 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    if (input.replaceAll("AC", "").replaceAll(",", "").length() == 0) {
      System.out.println("Done!");
    } else {
      System.out.println("Failed...");
    }
  }
}