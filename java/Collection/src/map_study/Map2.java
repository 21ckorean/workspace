package map_study;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
  public static void main(String[] args) {

    //key : 책번호
    Map<Integer, Book> map = new HashMap<>();

    map.put(1001, new Book("자바기본", 1000, "김자바"));
    map.put(1002, new Book("리액트 기본", 2000, "이자바"));
    map.put(1003, new Book("스프링 기본", 3000, "박자바"));

    //책번호가 1002번 책 가격을 출력
    System.out.println(map.get(1002).getPrice());


  }
  //이름과 나이를 리턴하는 메서드
  //자바의 리턴 데이터는 하나만 가능
  public static void aaa(){
    String name = "kim";
    int age = 20;

  }


}
