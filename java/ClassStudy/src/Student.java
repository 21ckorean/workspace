public class Student {
  String name;
  int age;
  String addr;
  int hak;
  String number;

  public void initStudent(String name, int age, String addr, int hak, String number){
    this.name = name;
    this.age = age;
    this.addr = addr;
    this.hak = hak;
    this.number = number;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getAddr(){
    return addr;
  }
  public int getHak(){
    return hak;
  }
  public String getNumber(){
    return number;
  }

  public void printInfo(){
    System.out.println("이름 : " + this.name);
    System.out.println("나이 : " + getAge());
    System.out.println("주소 : " + this.addr);
    System.out.println("학번 : " + getHak());
    System.out.println("번호 : " + this.number);
  }

}
