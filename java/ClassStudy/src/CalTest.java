import java.util.Scanner;

public class CalTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : " );
    int num1 = sc.nextInt();
    System.out.print("두번째 수 : " );
    int num2 = sc.nextInt();
    System.out.print("연산자 : " );
    String oper = sc.next();

    //메서드 호출문법 : 객체명.메서드호출;
    //Cal 클래스의 객체 생성
    Cal c = new Cal();
    c.setData(num1, num2, oper);
    c.printResult();
  }
}
