import java.util.Scanner;

public class Test1_1연습 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.print("출력값 : ");
    if(num1 + num2 > 50){
      System.out.print("두 수의 합이 50보다 큽니다.");
    }
    else{
      System.out.print("두 수의 합이 50이하 입니다.");
    }


  }
}
