public class Test2_3풀이 {
  public static void main(String[] args) {
    //1부터 20까지의 숫자 중에서 3의 배수가 아닌 수들의 합을 구하는 프로그램을 작성하세요.

    int sum = 0;
    for(int i = 1; i < 21; i++){
      if(i % 3 ==0){
        continue;
      }
      sum = sum +i;
    }
    System.out.println("sum = " + sum);


  }
}
