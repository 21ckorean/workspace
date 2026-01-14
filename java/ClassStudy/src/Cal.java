public class Cal {
  int num1;
  int num2;
  String oper;

  //모든 변수의 값을 변경하는 메서드
  public void setData(int num1, int num2, String oper){
    this.num1 = num1;
    this.num2 = num2;
    this.oper = oper;
  }


  //연산 결과를 출력하는 메서드
  public void printResult(){
//    switch(oper){
//      case "+", "-", "*", "/":
//        원래 내용 실행;
//        break;
//      default:
//    }

//    a || b || c
//    !a && !b && !c



    //연산자를 잘못 입력했으면 메서드 실행 중지
    if(!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))){
      return;
    }
    System.out.print(num1 + " " + oper + " " + num2 + " = ");

    switch(oper){
      case "+":
        System.out.println(num1 + num2);
        break;
      case "-":
        System.out.println(num1 - num2);
        break;
      case "*":
        System.out.println(num1 * num2);
        break;
      case "/":
        System.out.println(num1 / (double)num2);
    }
  }
  //매개변수로 전달된 데이터가 짝수일 때만 출력
  public void printEven(int num){
    if(num % 2 != 0) return;

    System.out.println(num);

  }

}
