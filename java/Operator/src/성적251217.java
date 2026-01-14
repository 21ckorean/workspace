import java.util.Scanner;

public class 성적251217 {
  public static void main(String[] args) {
    //키보드 입력을 위한 객체 생성
    Scanner sc = new Scanner(System.in);

    //======문제를 풀기 위한 변수 선언=====//
    //국어, 영어, 수학, 총점을 저장할 변수
    int korScore, engScore, mathScore, totalScore;
    double avg;

    //===== 국영수 점수 입력받기 =====//
    System.out.print("국어점수 : ");
    korScore = sc.nextInt();
    System.out.print("영어점수 : ");
    engScore = sc.nextInt();
    System.out.print("수학점수 : ");
    mathScore = sc.nextInt();

    //총점 및 평균 계산
    totalScore = korScore + engScore + mathScore;
    avg = totalScore / 3.0;

    //결과 출력
    System.out.println("총점 : " + totalScore);
    System.out.println("평균 : " + avg);;

  }
}
