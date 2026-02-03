package test;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1)
    int[] arr = new int[3];

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a != b && b != c && a!= c
            && a == (int)(Math.random() * 9 +1)
            && b == (int)(Math.random() * 9 +1)
            && c == (int)(Math.random() * 9 +1)){
      arr[0] = a;
      arr[1] = b;
      arr[2] = c;
    }

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
