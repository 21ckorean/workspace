public class TestWhile7 {
  public static void main(String[] args) {
    int cnt = 0;
    int i = 1;

    System.out.println("5의 배수");
    while(i <101){
      if(i % 5 == 0){
        cnt++;
        System.out.print(i + " ");
      }
      i++;
    }
    System.out.println("5의 배수의 갯수");
    System.out.println(cnt);
  }
}
