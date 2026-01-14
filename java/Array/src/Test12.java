import java.util.Scanner;

public class Test12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 0 : 국어, 1 : 수학, 2: 영어, 3:총점
    int[] score = new int[4];
    double avg = ((double)score[3]/3);

    for(int i = 0; i < score.length-1; i++){
      score[i] = sc.nextInt();

    }

    // score[0]+score[1]+score[2] = score[3]
    // (double)score[3] / 3 = avg;


    System.out.println();
  }
}
