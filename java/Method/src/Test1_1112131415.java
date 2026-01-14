public class Test1_1112131415 {
  public static void main(String[] args) {

    test11(11, 20);

    test12(10);

    test13(10,20);

    test14(119,140);
  }

  public static void test11(int a, int b){
    if(a % 2 == 0 && b % 2 == 0){
      System.out.println("두 수는 짝수입니다");
    }
    else if((a % 2 == 0 && b % 2 != 0)||(a % 2 != 0 && b % 2 == 0)){
      System.out.println("한 수만 짝수입니다");
    }
    else{
      System.out.println("두 수는 홀수입니다");
    }
  }
  public static void test12(int a){
    for(int i = 0; i < a+1; i++){
      System.out.println(i);
    }
  }
  public static void test13(int a, int b){
    int max = 0;
    int min = 0;

    //큰수를 결정
    if(a > b){
      max = a;
      min = b;
    }
    else{
      max = b;
      min = a;
    }
    //
    for(int i = min+1; i < max; i++){
      System.out.println(i);
    }
  }
  public static void test14(int a, int b){
    int max = 0;
    int min = 0;
    int cnt = 0;
    if(a > b){
      max = a;
      min = b;
    }
    else{
      max = b;
      min = a;
    }
    for(int i = min+1; i < max; i++){
      if(i % 5 == 0){
        cnt++;
      }
    }
    System.out.println("5의 배수의 개수 : " + cnt);
  }
  public static void test15(){

  }


}
