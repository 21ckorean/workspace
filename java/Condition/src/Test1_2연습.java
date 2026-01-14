import java.util.Scanner;

public class Test1_2연습 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.print("출력값 : ");
    if(num % 2 == 0 ){
      System.out.print("짝수입니다");
    }
    else{
      System.out.println("홀수입니다");
    }
  }
}
