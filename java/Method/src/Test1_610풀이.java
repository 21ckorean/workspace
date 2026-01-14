public class Test1_610풀이 {
  public static void main(String[] args) {

    //test6(10,4);
    //test10(10);
  }

  //두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메서드
  public static void test6(int a, int b){
    System.out.println(a / b);
    System.out.println(a % b);
  }

  //한 정수를 매개변수로 받아, 그 정수가 짝수이면 '짝수입니다', 홀수이면 '홀수입니다'를 출력하는
  //메소드를 선언하고 호출해보세요.
  public static void test10(int num){
    System.out.println( num % 2 == 0 ? "짝수입니다" : "홀수입니다" );
  }

}
