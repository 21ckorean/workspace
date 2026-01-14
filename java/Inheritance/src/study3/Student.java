package study3;





//클래스 선언 시 어떠한 클래스도 상속받지 않으면
//자동으로 Object 클래스를 상속한다.

// 결론 : 자바의 모든 클래스는 Object 클래스를 상속한다.
// 파생 결론 : Object 클래스로 모든 클래스의 객체를 받을 수 있다.
public class Student {
  int stuNum;
  private String name;
  private int score;

  //Student 클래스의 객체가 같다라는 의미를 재정의
  @Override
  public boolean equals(Object obj) {//Object obj = new Student();
    Student a = (Student)obj;
    return stuNum == a.stuNum;
  }

  @Override
  public String toString() {
    return "Student{" +
            "stuNum=" + stuNum +
            ", name='" + name + '\'' +
            ", score=" + score +
            '}';
  }

  //매개변수에 무엇이든 다 넣겠다..
  public void aaa(Object a){

  }




}
