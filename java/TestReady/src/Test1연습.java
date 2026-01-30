import java.util.Scanner;

public class Test1연습 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max, mid, min;

    if(a > b && a > c){
      max = a;
      mid = b > c ? b : c;
      min = b < c ? b : c;
    }

    if(b > a && b > c){
      max = b;
      mid = Math.max(a, c);
      min = Math.min(a, c);
    }

    if(c > a && c > b){
      max = c;
      mid = a > b ? a : b;
      min = Math.min(a,b);
    }

    System.out.println("입력받은 세 정수 중 가장 큰 수 : " + max);
    System.out.println("입력받은 세 정수 중 가장 큰 수 : " + mid);
    System.out.println("입력받은 세 정수 중 가장 큰 수 : " + min);
  }
}
