import java.sql.SQLOutput;
import java.util.Scanner;

public class Method_4 {
  public static void main(String[] args) {
    printSum(10, 20);
    printInfo("Kim", 20);

    Scanner sc = new Scanner(System.in);
    System.out.println("8번 문제 매개변수 : ");
    int a = sc.nextInt();
    test8(a);

  }

  //키보드로 입력받은 점수를 매개변수로 받아, 해당 정수를 출력하는 메소드
  public static void test8(int num){
    System.out.println(num);
  }


  //매개변수로 전달된 이름과 나이를 출력하는 메서드
  public static void printInfo(String name, int age){
    System.out.println(name);
    System.out.println(age);

  }


  //매개변수로 들어온 두 정수의 합을 출력하는 메서드
  public static void printSum(int a, int b){
    //int a = 10;
    //int b = 20;
    System.out.println(a + b);

  }

}
