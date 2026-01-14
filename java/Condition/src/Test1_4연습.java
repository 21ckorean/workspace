import java.util.Scanner;

public class Test1_4연습 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    System.out.print("출력값 = ");
    if(num % 3 == 0){
      System.out.print("3의 배수입니다");
    }
  }
}
