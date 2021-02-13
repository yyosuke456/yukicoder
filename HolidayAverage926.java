import java.util.Scanner;

// https://yukicoder.me/problems/no/926
public class HolidayAverage926 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    double year = Double.parseDouble(sc.next());
    double week = Double.parseDouble(sc.next());
    double holiday = Double.parseDouble(sc.next());
    System.out.println(year * (holiday / week));
  }
}