import java.util.Scanner;

public class Testfor8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnt = 0;

    for(int i = sc.nextInt(); i > 0; i--){
      if(i % 2 == 0){
        cnt++;
      }
    }
    System.out.println("1부터 입력받은 수까지 중 짝수의 개수 : ");
    System.out.println(cnt);

  }
}
