public class Test2_6풀이 {
  public static void main(String[] args) {
    //2부터 30까지의 숫자 중에서 소수만 출력하는 프로그램을 작성하세요.
    //소수 : 1과 자신으로만 나누어 떨어지는 수
    //어떤 수가 소수인지 판단하기 위해
    //1. 2부터 어떤수까지 1씩 증가하면서 나누기를 반복한다.
    //2. 1번의 반복을 2부터 30까지 반복한다.


    for(int i = 2; i < 31; i++){
      int cnt = 0; //나누어 떨어지는 갯수
     //i 가 소수면 출력
      for(int j = 1; j < i + 1; j++){
        if(i % j == 0){
          cnt++; //나머지가 0인 횟수
          if(cnt > 2){
            break;
          }
        }
      }

      if(cnt == 2){
        System.out.println(i);
      }
    }
  }
}
