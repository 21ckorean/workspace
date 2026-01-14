import java.util.Scanner;

public class Test8풀이 {
  public static void main(String[] args) {
    //키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.
    // ex> 키보드로 6을 입력 -> 1 ~ 6에서 짝수의 갯수 -> 2, 4, 6 => 3개
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 입력 : ");
    int num = sc.nextInt();

    int i = 1;
    int cnt = 0;
    while(i < num + 1){
      if(i % 2 == 0){
        cnt++;
      }
      i++;
    }
    System.out.println(cnt);
  }
}
