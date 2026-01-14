package list_study;

import java.util.ArrayList;
import java.util.List;

public class Test1_1 {
  public static void main(String[] args) {

    List<String> list1 = new ArrayList<>();

    list1.add("가");
    list1.add("나");
    list1.add("다");

    for(String e : list1){
      System.out.println(e);
    }
  }
}
