package list_Test;

import java.util.ArrayList;
import java.util.List;

//    리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
//    그 후 저장된 데이터 중 짝수의 개수와 모든 짝수 를 출력하는 프로그램을 만드세요.
//    (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)
public class Test1_4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < 10 ; i++){
      int rand = (int)(Math.random() * 100 +1);
      list.add(rand);
    }

    int cnt = 0; // 짝수의 갯수
    for(int e : list){
      if(e % 2 == 0){
        System.out.println(e);
        cnt++;
      }
    }
    System.out.println("짝수의 갯수 : " + cnt);
  }
}
