public class Test2_5678910풀이 {
  public static void main(String[] args) {

    String result = test5(88);
    System.out.println(result);
  }

  //매개변수로 문자열 데이터 하나를 받아
  //해당 문자열의 길이가 짝수일 때는 true를 리턴하고, 홀수일 때는 false를 리턴하는 메서드
  public  static boolean test10(String str){
//    "java".length(); //4
//
//    String aa = "java";
//    aa.length(); // 4

//    if( str.length() % 2 == 0 ){
//      return true;
//    }
//    else{
//      return false;
//    }

    return str.length() % 2 ==0 ? true : false;
//    return str.length() % 2 ==0;
  }

  //한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드
  public static int test9(int num){
    int sum = 0;

    for(int i = 1; i < num+1; i++){
      if(i % 2 !=0){
        sum = sum +i;
      }
    }
    return sum;
  }




  //매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드
  //자바는 문자열과 숫자를 변환할 수 있다. 엄청빈번하게함.
  public static String test6(int num){
    //정수 -> 문자열 Integer.parseInt("6"); -> 6
    int a = Integer.parseInt("6");

    //문자열 -> 정수  String.valueOf(6); -> "6"
    String b = String.valueOf(6);


    return num + "";            //숫자 + 문자열 = 문자열
  }

  //8번 public static double test8(int a, int b, int c){
  // return (a+b+c) / 3.0;
  // }

  //임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90이상이면 'A'
  //70이상이면 'B', 그 외의 수가 들어오면 'C'를 리턴하는 메소드
  public static String test5(int num){
    if(num >= 90){
      return "A";
    }
    else if(num >= 70){
      return "B";
    }
    else{
      return "C";
    }
  }


}
