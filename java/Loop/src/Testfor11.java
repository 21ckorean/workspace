import java.util.Scanner;

public class Testfor11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;

    for(int i = a + 1; i < b; i++) {
      sum = sum + i;
    }

    System.out.print("두 정수 사이의 모든 정수의 합 : ");
    System.out.println(sum);
  }
}
