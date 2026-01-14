import java.util.Scanner;

public class Test2_1234풀이 {
  public static void main(String[] args) {
//    int result1 = test1(1,3);
//    System.out.println(result1);

    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int result = test2(a, b);
//    System.out.println(result);

    String result = test4("집에","가고싶다");
    System.out.println(result);
  }



  //두 정수를 매개변수로 받아, 두 정수의 합을 리턴하는 메소드
  public static int test1(int a, int b){
    return a + b;
  }

  //scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 고을 리턴하는 메소드
  public static int test2(int a, int b){
    return a * b;
  }

  //두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드
  public static int test3(int a, int b){
    return a > b ? a : b;  // return Math.max(a, b); 를 사용해도됨
  }

  //두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드
  public static String test4(String a, String b){//a = "abc", b = "ed" => "abcde"
    return a + b;
  }

  //

}
