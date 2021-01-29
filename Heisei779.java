import java.util.Scanner;

// https://yukicoder.me/problems/no/779
public class Heisei779 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む

    int year = Integer.parseInt(sc.next());
    int month = Integer.parseInt(sc.next());
    int day = Integer.parseInt(sc.next());

    int datetime = year * 10000 + month * 100 + day;

    if (datetime <= 20190430 && datetime >= 19890108) {

      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}