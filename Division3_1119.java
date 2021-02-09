import java.util.Scanner;

// https://yukicoder.me/problems/no/1119
public class Division3_1119 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    boolean result = false;
    for (int i = 0; i < 3; i++) {
      if (Integer.parseInt(sc.next()) % 3 == 0) {
        result = true;
      }
    }
    if (result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}