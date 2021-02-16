import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://yukicoder.me/problems/no/975
public class MrMaxValue975 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);
    int itemNumber = Integer.parseInt(sc.next());
    int mrMaxItemNumber = Integer.parseInt(sc.next());
    int maxValuItemNumber = Integer.parseInt(sc.next());
    List<Integer> mrMaxItemList = new ArrayList<Integer>();
    List<Integer> maxValuItemList = new ArrayList<Integer>();

    for (int i = 0; i < mrMaxItemNumber; i++) {
      mrMaxItemList.add(Integer.parseInt(sc.next()));
    }
    for (int j = 0; j < maxValuItemNumber; j++) {
      maxValuItemList.add(Integer.parseInt(sc.next()));
    }
    if (mrMaxItemList.contains(itemNumber) && maxValuItemList.contains(itemNumber)) {
      System.out.println("MrMaxValu");
    } else if (mrMaxItemList.contains(itemNumber)) {
      System.out.println("MrMax");
    } else if (maxValuItemList.contains(itemNumber)) {
      System.out.println("MaxValu");
    } else {
      System.out.println("-1");
    }
  }
}