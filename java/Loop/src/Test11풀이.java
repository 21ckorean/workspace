import java.util.Scanner;

public class Test11풀이 {
  public static void main(String[] args) {
    //키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.
    //1~10 두 정수 사이 2~9

    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    int num2 = sc.nextInt();

    int max = num1 > num2 ? num1 : num2; //10
    int min = num1 > num2 ? num2 : num1; //1

    int sum = 0;
    for(int i = min + 1; i < max; i++){
      sum = sum + i;
    }

    System.out.println(sum);

  }
}
