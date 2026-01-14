public class While_3 {
  public static void main(String[] args) {
    //1부터 10까지의 합을 출력
    int i = 1;
    int sum = 0; //1~10까지의 합을 저장할 변수

    while(i < 6){
      sum = sum + i;
      i++;
    }

    System.out.println(sum);

  }
}
