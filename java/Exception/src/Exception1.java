import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리 -> 오류처리
/*
예외처리 문법
try{
  예외가 발생할 수 있는 코드 작성 , 두번째줄 오류발생하면 세번째줄 실행안되고 바로 캐치문 실행함.
  1. 첫번째 줄
  2. 두번째 줄
  3. 세번째 줄
} catch(Exception e){
  예외 발생 시 실행할 코드
}
 */
public class Exception1 {
  public static void main(String[] args) {
    //예외가 발생하는 직시 프로그램 종료
    Scanner sc = new Scanner(System.in);

    try{
      System.out.print("첫번째 수 : ");
      int a = sc.nextInt();
      System.out.print("두번째 수 : ");
      int b = sc.nextInt();

      System.out.println("a / b = " + a / b);
    }catch(ArithmeticException e){
      System.out.println("수학적 문제 발생");
      // e.getMessage() : 예외 발생 이유를 문자열로 리턴
      System.out.println(e.getMessage());
      e.printStackTrace();
    } catch(InputMismatchException e) {
      System.out.println("문자적 문제 발생");
      e.printStackTrace();
    }

    System.out.println("프로그램 종료");



  }
}
