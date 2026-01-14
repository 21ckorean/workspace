public class TestWhile6 {
  public static void main(String[] args) {
    //1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
    int cnt = 0; //3의 배수의 갯수를 저장할 변수
    int i = 1;
    //1. 1~100까지 반복하면서 해당 숫자가 3의 배수인지 체크
    //2. 3의 배수라면 cnt 값을 1 증가시킨다.
    //3. cnt를 출력

    while(i < 101){
      if(i % 3 == 0){
        cnt++;
      }
      i++;
    }
    System.out.println(cnt);

  }
}
