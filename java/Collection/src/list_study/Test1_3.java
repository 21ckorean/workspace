package list_study;

import java.util.ArrayList;
import java.util.List;

public class Test1_3 {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    for(String e : list){
      if(e.equals("홍길동")){
        System.out.println("해당 이름이 존재합니다.");
      }
    }
  }
}
