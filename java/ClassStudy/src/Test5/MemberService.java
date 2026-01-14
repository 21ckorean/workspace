package Test5;

public class MemberService {
  private String id;
  private String password;

  public MemberService(){

  }

  //매개변수로 전달된 id = "hong", pw ="12345"일때 true 리턴
  public boolean login(String id, String password){
    if(id.equals("hong") && password.equals("12345")){
      return true;
    }
    else{
      return false;
    }

//    return id.equals("hong") && password.equals("12345");
  }

  public void logout(String id){
    System.out.println("로그아웃 되었습니다");
  }


}
