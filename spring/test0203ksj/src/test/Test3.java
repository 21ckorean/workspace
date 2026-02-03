package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    int clapCnt = 0;

    num = sc.nextInt();

    int hundreds = num / 100;
    int tens = num / 10;
    int ones = num % 10;

    if(hundreds % 3 == 0 && hundreds != 0){
      clapCnt++;
    }
    if(tens % 3 == 0 && tens != 0){
      clapCnt++;
    }
    if(ones % 3 == 0 && tens != 0){
      clapCnt++;
    }

    switch(clapCnt){
      case 0 :
        System.out.println("박수 0번");
        break;
      case 1 :
        System.out.println("박수 1번");
        break;
      case 2 :
        System.out.println("박수 2번");
        break;
      case 3 :
        System.out.println("박수 3번");
        break;
    }
  }
}
