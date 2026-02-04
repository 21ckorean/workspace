package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //풀이
    //문제 배열
    int[] baseball = new int[3];

    //도전횟수를 저장할 변수
    int tryCnt = 0;

    //작성한 정답번호를
    int[] answer = new int[3];

    //중복없이 1~9 사이의 랜덤 정수 저장
    for(int i = 0; i < baseball.length; i++){
      //중복검사 없이 일단 랜덤한 수를 배열에 저장
      baseball[i] = (int)(Math.random() * 9 +1);

      //방금 넣은 정수가 중복인지 확인
      for(int j = 0; j < i; j++){
        //정수가 중복이면...
        if(baseball[i] == baseball[j]){
          i--;
          break;
        }
      }
    }

    System.out.println("만들어진 배열 : " + Arrays.toString(baseball));

    //정답을 맞출 때 까지 정답지 작성
    while(true){
      int strike = 0, ball = 0;

      //정답 작성
      System.out.print(++tryCnt + " >> " );
      answer[0] = sc.nextInt();
      answer[1] = sc.nextInt();
      answer[2] = sc.nextInt();

      //답 체크
      for(int i = 0; i < baseball.length ; i++){ //baseball 배열의 데이터 수만큼 반복
        for(int j = 0; j < answer.length; j++){ //answer 배열의 데이터 수만큼 반복
          if(baseball[i] == answer[j]){
            if(i == j){
              strike++;
            }
            else{
              ball++;
            }
          }
        }
      }

      //결과 출력
      System.out.println(strike + "S, " + ball + "B");

      //3s면..
      if(strike == 3){
        System.out.println(tryCnt + "회만에 정답을 맞췄습니다");
        break; //while문 벗어남
      }
    }



//    // 1)
//    int[] arr = new int[3];
//
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//    if(a != b && b != c && a!= c
//            && a == (int)(Math.random() * 9 +1)
//            && b == (int)(Math.random() * 9 +1)
//            && c == (int)(Math.random() * 9 +1)){
//      arr[0] = a;
//      arr[1] = b;
//      arr[2] = c;
//    }

    // 2)
//    boolean result = true;
//    boolean result1 = false;
//    boolean result2 = false;
//    int ball = 0;
//    int strike = 0;
//    while(result){
//      if(a){
//
//      }
//
//
//      if(strike == 3){
//        break;
//      }
//    }



  }
}
