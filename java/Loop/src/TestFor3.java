public class TestFor3 {
  public static void main(String[] args) {

    for(int i = 2; i <11; i += 2){
      System.out.print(i + " ");
    }

    for(int i = 2; i < 11; i++){//2 3 4 5 6 .... 10
      //i가 짝수면 출력하세요.
      if(i % 2 == 0){
        System.out.print(i);
      }
    }
  }
}
