import java.util.Arrays;

public class Test2_5풀이 {
  public static void main(String[] args) {

    int[] lotto = new int[6];

    // 1 ~ 45의 랜덤한 정수를 생성 *6
    for(int i = 0; i <lotto.length; i++){
      // 0. <= x <1.0 실수
      lotto[i] = (int)(Math.random() * 45 +1);
    }

    //로또 번호 출력
    System.out.println(Arrays.toString(lotto));
  }
}
