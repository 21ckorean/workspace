package study3;

import study2.UnivFriend;

public class StudentTest {
  public static void main(String[] args) {

    Student s = new Student();
    Object a = new Student();
    Object b = new Student();
    Object c = new UnivFriend("aa","bb", "cc");

    //Object 클래스에 선언된 equals() 메서드
    //public boolean equals(Object o)
    //현재 객체와 매개변수로 전달된 데이터가 같으면 true를 리턴하는 메서드
    //같다라는 의미는 개발자가 정하는 거다.
    //그렇지만 자바에서 의미하는 기본적인 '같다의 의미는 같은 주소값을 참조하고 있다'다.
    //equals 메서드를 원래 기능대로 쓰지말고, 개발자가 입맛대로 같다는 의미를
    //재 정의해서 사용하세요~~~
    UnivFriend f1 = new UnivFriend("aa","aa","010");
    UnivFriend f2 = new UnivFriend("aa","aa","010");
    System.out.println(f1.equals(f2));

    f2 = f1;
    System.out.println(f1.equals(f2));

    Student s1 = new Student();
    s1.stuNum = 1;
    Student s2 = new Student();
    s2.stuNum = 1;

    System.out.println(s1.equals(s2));

    //Object 클래스의 toString() 메서드
    //public String toString()
    // => 기본정의 : 객체의 정보를 문자열로 리턴하는 메서드
    //문자열로 표현할 정보를 개발자가 재정의해서 사용하세요!!
    // => 객체가 가진 맴버변수의 정보를 문자열로 리턴
    System.out.println(s1.toString());
    //객체명만 출력하면 자동으로 toString() 메서드가 호출됨
    System.out.println(s1);


    //배열도 객체다
    String[] arr = new String[3];
    System.out.println(arr);
    System.out.println(arr.toString());





  }
}
