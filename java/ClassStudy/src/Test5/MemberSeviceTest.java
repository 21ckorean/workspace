package Test5;

public class MemberSeviceTest {
  public static void main(String[] args) {
    MemberService memberService = new MemberService(); //멤버서비스라는 객체생성
    boolean result = memberService.login("hong", "12345");

    if(result){
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    }
    else{
      System.out.println("id 또는 pw가 올바르지 않습니다.");
    }

  }
}
