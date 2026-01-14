package list_study;

import java.util.ArrayList;
import java.util.List;

public class Test1_4 {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();


    for(int i = 0 ; i < 10 ; i++){
      int a = (int)(1 + Math.random() * 100);
      list.add(a);
    }

    int cnt = 0;
    System.out.println("모든 짝수 : ");
    for(Integer e : list){
      if(e % 2 == 0){
        cnt++;
        System.out.println(e);
      }
    }
    System.out.println("짝수의 개수 : " + cnt);
  }
}
