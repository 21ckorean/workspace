package list_Test;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {
    List<Member> memberList = new ArrayList<>();

    //첫번째 방법 생성자없이.
    Member m1 = new Member();
    m1.setId("aaa");
    m1.setPw("1111");
    m1.setName("kim");
    m1.setAge(20);

    memberList.add(m1);

    //두번째 방법 맴버변수를 매개변수로 갖는 생성자 생성후.
    Member m2 = new Member("java","2222", "lee", 30);
    memberList.add(m2);

    //세번재 방법 맴버변수를 매개변수로 갖는 생성자 생성후 이렇게도가능.
    memberList.add(new Member("ccc", "3333", "park", 40));

    for(int i = 0; i < memberList.size(); i++){
      System.out.println(memberList.get(i));
    }

    for(Member member : memberList){
      System.out.println(member);
    }

    System.out.println();

    //7
    int sum = 0;
    for(Member member : memberList){
      sum = sum + member.getAge();
    }
    System.out.println(sum);

    System.out.println();

    //8. 몇번째 데이터를 지울까?
    //id가 java인 회원이 몇번째 데이터인가?
    int foundIndex = -1;
    for(int i = 0; i < memberList.size(); i++){
      if(memberList.get(i).getId().equals("java")){
        foundIndex = i;
        //memberlist.remove(i);
      }
    }
    if(foundIndex != -1) {
      memberList.remove(foundIndex);
    }
    else{
      System.out.println("일치하는 학생이 없어 삭제하지 못했습니다");
    }

    memberList.remove(foundIndex);

    for(Member member : memberList){
      System.out.println(member);
    }


  }
}
