public class Member1 {
  String name;
  String id;
  String pw;

  public Member1(){

  }

  public Member1(String name, String id, String pw){
    this.name = "null";
    this.id = "null";
    this.pw = "1234";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }
}
