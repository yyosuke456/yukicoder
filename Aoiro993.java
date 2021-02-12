import java.util.Scanner;

// https://yukicoder.me/problems/no/993
public class Aoiro993 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(s.replaceAll("ao", "ki"));
  }
}