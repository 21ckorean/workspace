package list_Test1;

import java.util.ArrayList;
import java.util.List;

public class TestMemberr {
  public static void main(String[] args) {
    //6
    List<Memberr> m = new ArrayList<>();

    m.add(new Memberr("aaa", "111", "김자바", 20));
    m.add(new Memberr("bbb", "222", "이자바", 30));
    m.add(new Memberr("ccc", "333", "박자바", 40));

    for(Memberr e : m){
      System.out.println(e);
    }

    //7
    int sum = 0;
    for(Memberr e : m){
    }





  }
}
