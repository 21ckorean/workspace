public class Member {
  String name;
  String id;
  String password;
  int age;

 //회원의 모든 정보를 변경하는 기능을 가진 메소드
  public void setMemberInfo(String name1, String id1, String pw1, int age1){
    name = name1;
    id = id1;
    password = pw1;
    age = age1;
  }
  //회원의 모든 정보 출력
  public void printAllData(){
    System.out.println("name : " + name);
    System.out.println("id : " + id);
    System.out.println("password : " + password);
    System.out.println("age : " + age);
  }
}

