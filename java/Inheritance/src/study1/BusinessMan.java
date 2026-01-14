package study1;

import javax.naming.Name;

public class BusinessMan extends Man{
  String company;

  //생성자 쓰는이유 : 맴버변수의 값을 초기화하기위해서.. 이게좋은거임
  //모든 맴버변수를 초기화하는게 좋은 코드!
  //상속받은 맴버변수는 어디서 초기화?
  // -> 부모클래스의 맴버변수 초기화는 부모클래스에서 하는게 맞음!
  //상속 관계에 있는 클래스의 생성자 첫 줄에 super() 명령어 숨겨져 있음

  public BusinessMan (String company){
    super("sdsd");
    this.company = company;
    //name = null;
  }

  public BusinessMan(){
    super("park");

  }


  public void tellCompany(){
    System.out.println("company - " + company);
  }
}
