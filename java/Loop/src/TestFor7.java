public class TestFor7 {
  public static void main(String[] args) {

    int cnt = 0;

    System.out.print("5의 배수인 수 : ");
    for(int i = 1; i<101; i++){
      if(i % 5 == 0){
        System.out.print(i + " ");
        cnt++;
      }
    }
    System.out.println();
    System.out.print("5의 배수인 수의 개수 : ");
    System.out.println(cnt + "개");
  }
}
