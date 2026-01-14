import java.util.Scanner;

public class Test1_3연습 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.print("출력값 = ");
    if(a > b){
      System.out.print("a가 b보다 큽니다");
    }
    else if(a < b){
      System.out.print("b가 a보다 큽니다");
    }
    else{
      System.out.print("같습니다");
    }

  }
}
