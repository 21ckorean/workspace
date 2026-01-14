public class Test1_1112131415풀이 {
  public static void main(String[] args) {

    //test11(100,200);
    //test12(10);
    //test13(10,1);

    test15("kim",3);

  }

  public static void test11(int a, int b){
    if(a % 2 == 0 && b % 2 == 0){
      System.out.println("둘 다 짝수");
    }
    else if(a % 2 != 0 && b % 2 != 0){
      System.out.println("둘 다 짝수");
    }
    else{
      System.out.println("하나만 짝수");
    }

  }
  //한 정수를 매개변수로 받아, 0부터 입력받은숫자까지 출력하는 메소드를 선언 및 호출해봐.
  public static void test12(int num){
    for(int i = 0; i < num +1; i++){
      System.out.println(i);
    }
  }
  //두 정수를 매겨변수로 받아, 두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해봐.
  public static void test13(int num1, int num2){//가정하고풀어봐.num1=1, num2=10 ->2~9
    //num1과 num2에서 큰 수와 작은 수를 구분
    int max = Math.max(num1, num2);
    int min = Math.min(num1, num2);
    //min = 1, max = 10 => 2 ~ 9
    for(int i = min+1; i < max; i++){
      System.out.println(i);
    }
  }

  //두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드
  public static void test14(int a, int b){
    int max = Math.max(a, b);
    int min = Math.min(a, b);

    //min = 3, max = 7 ->
    int cnt = 0;
    for(int i = min+1; i < max; i++){
      if(i % 5 ==0) cnt++;
    }
    System.out.println(cnt);
  }

  public static void test15(String str, int num){
    //str = "kim", num = 3 => kimkimkim
    for(int i = 0; i < num; i++){
      System.out.println(str);
    }


  }
}
