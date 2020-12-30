import java.util.Scanner;

public class nDoNe296 {

  // https://yukicoder.me/problems/no/296
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    int awakeCount = Integer.parseInt(sc.next());
    int hour = Integer.parseInt(sc.next());
    int minute = Integer.parseInt(sc.next());
    int interval = Integer.parseInt(sc.next());

    minute += (awakeCount - 1) * interval;
    if (minute >= 60) {
      hour += minute / 60;
      minute = minute % 60;
    }

    if (hour >= 24) {
      hour = hour % 24;
    }
    System.out.println(hour);
    System.out.println(minute);

  }
}
