public class Test2_2풀이 {
  public static void main(String[] args) {
    //1부터 시작해서 숫자를 하나씩 출력하다가
    //7이 나오면 반복문을 종료하는 프로그램을 작성하세요.
    int i = 1;
    while(true){
      System.out.println(i);
      if(i == 7){
        break;
      }
      i++;
    }
  }
}
