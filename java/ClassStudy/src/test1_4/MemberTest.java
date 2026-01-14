package test1_4;

public class MemberTest {
  public static void main(String[] args) {

    Member m1 = new Member(); // 첫번째방법 : 객체 생성할때 비어있는 기본생성자 사용.
    m1.setName("자바");   //필드에 프라이빗써놔서 바로 쓸수없어서 세터활용.
    m1.setId("java");
    m1.setPw("123");
    System.out.println( m1.getName() );
    System.out.println( m1.getId() );
    System.out.println( m1.getPw() );

    /// /////////////////////////////////////////////////

    Member m2 = new Member("자바", "java", "123"); //두번째방법 : 모든데이터변경하는 생성자 사용.
    m2.displayInfo();

    System.out.println(m2.toString());
    //객체명만 출력하면 자동으로 toString() 메서드가 호출됨. 자바의약속..
    System.out.println(m2);   //똑같이나옴;;

  }
}
