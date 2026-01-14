package test1_4;

public class Member {
  private String name;
  private String id;
  private String pw;

  //기본생성자
  public Member(){}

  //모든 데이터를 변경할 수 있는 생성자               ※이름이 같더라도 매개변수가 다르면 중복선언가능(오버로딩)
  public Member(String name, String id, String pw){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  // 단축키 : alt + insert 게터세터 자동완성
  //setter : 맴버변수 각각의 데이터를 변경하는메서드 + set맴버변수명
  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }
  //getter : 맴버변수 각각의 데이터를 리턴받는 메서드 +get맴버변수명
  public String getName(){
    return name;
  }

  public String getId(){
    return id;
  }

  public String getPw(){
    return pw;
  }
  //3번
  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비번 : " + pw);
  }

  @Override
  public String toString() {
    return "Member{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            '}';
  }
}
