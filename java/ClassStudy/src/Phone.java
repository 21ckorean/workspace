//휴대폰 객체 생성을 위한 설계도
//클래스의 구성 요소 :
// 1. 변수(맴버변수, 필드)
//    지금까지 선언한 변수(메서드안에서 선언한 변수)는 지역변수(local variable)라 부른다
//    지역변수는 반드시 초기화가 필요!, 멤버변수는 자동으로 초기화
// 2. 메서드의 정의
// 3. 생성자

public class Phone {
  int price; //가격
  String modelName; //모델명
  String brand; //브랜드

  //문자 보내는 기능
  //접근제한자 리턴타입 메서드명(매개변수)
  public void sendSms(String msg){
    int age; // 지역변수
    // System.out.println(age); 오류발생. 변수를 사용하려면 변수를 선언하고 초기화를 시켜야 사용가능
    System.out.println("문자를 보냅니다 : " + msg);
  }

  //전화하기 기능
  public void call(String sender){
    System.out.println(sender + "님으로부터 전화가 왔습니다.");
  }

}



//여러분들은 지금까지 변수 선언을 메서드 정의 안에서 했어요!
//public static void main(String[] args) {
//  int a;
//}
//public static void aaa(){
//  int max;
//}

//메서드의 정의 문법
//접근제한자 리턴타입 메서드명(매개변수){}
//메서드 호출 test();

