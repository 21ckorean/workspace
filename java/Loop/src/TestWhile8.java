import java.util.Scanner;

public class TestWhile8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int cnt = 0;
    while(i > 0){
      if(i % 2 == 0){
        cnt++;
      }
    i--;
    }
    System.out.println();
    System.out.println(cnt);
  }
}
