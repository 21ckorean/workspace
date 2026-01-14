package list_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());

    int sum = 0;
    for(Integer e : list){
      sum = sum + e;
      }
    System.out.println(sum);
  }
}
