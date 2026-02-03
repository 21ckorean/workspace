package test;

public class MemberTest {
  public static void main(String[] args) {
    //a
    Member m =  new Member();
    m.setInfo("java", "1234", "kim", 20);

    //b
    m.showInfo();

    //c
    m.isLogin("java", "1234");

    //d
    m.isLogin("java", "1111");
  }
}
